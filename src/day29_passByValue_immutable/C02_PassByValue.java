package src.day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
        birden fazla element içeren array ve arraylist gibi yapýlarda da
        passByValue geçerlidir.

        eðer methofd'da array veya list'in kendisi deðiþtirilirse
        passByValue özelliði sebebiyle Java deðiþen deðeri deðil
        array veya List'in orijinal deðerini alýr.

        Ancak array veya list deðiþtirilirse
        sadece içindeki elemanlar deðiþtirilirse
        Java objcet deðiþmediði için ( referans ayný)
        ayný array veya list'i bize  döndürür
        ancak içindeki elementler deðiþmiþ olacaktýr.

         */
        /*
        verilen 4 elemanlý bir array'i
        method'a gönderelim.
        method'da yeni 3 elamanlý bir array atayýp
        bu yeni array'a rastgele 100'den küçük 3 sayý atayalým.
        method'da array'i yazdýralým

        main method'da da method call'dan sonra yeniden method'u yazdýralým
         */
        int[] arr = {3, 5, 8, 10};

        arrayDegistir(arr);

        System.out.println("Method Dýþý Arrays.toString(arr) = " + Arrays.toString(arr));


    }

    public static void arrayDegistir(int[] arr) {

        arr = new int[3];
        Random rnd = new Random();

        arr[0] = rnd.nextInt(100);
        arr[1] = rnd.nextInt(100);
        arr[2] = rnd.nextInt(100);

        System.out.println("Method içi Arrays.toString(arr) = " + Arrays.toString(arr));

    }
}
