package src.day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        4 elemanlý bir array oluþturalým.
        sonra ayýr bir method'da
        bu array'in 2. ve 4. elemanlarýný
        100'den küçük rastgele bir sayý ile deðiþtirelim
        ve yeni halini yazdýralým.
         */

        int[] arr = {5, 7, 8, 10};

        System.out.println(arr); // REFERANS DEÐERÝ
        elemanDegistir(arr);


        System.out.println("elemanDegistir Methodu çalýþtýktan sonra = " + Arrays.toString(arr));

        /*
        Array'lar referans deðerleri STOCK memmory'de bulundurmakta
        deðerleri ise HEAP memory'de saklanmaktadýr.
        bu sebeple deðiþimler kalýcý olur.
         */
    }

    public static void elemanDegistir(int[] arr) {
        Random rnd = new Random();
        arr[1] = rnd.nextInt(100);
        arr[3] =rnd.nextInt(100);

        System.out.println("Method'un içinden\t\t\t\t\t\t = "+Arrays.toString(arr)); // [5, rnd, 8, rnd]
        System.out.println(arr); // REFERANS DEÐERÝ DEÐÝÞMEZ
    }
}
