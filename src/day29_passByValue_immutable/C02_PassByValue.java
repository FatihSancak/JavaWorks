package src.day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
        birden fazla element i�eren array ve arraylist gibi yap�larda da
        passByValue ge�erlidir.

        e�er methofd'da array veya list'in kendisi de�i�tirilirse
        passByValue �zelli�i sebebiyle Java de�i�en de�eri de�il
        array veya List'in orijinal de�erini al�r.

        Ancak array veya list de�i�tirilirse
        sadece i�indeki elemanlar de�i�tirilirse
        Java objcet de�i�medi�i i�in ( referans ayn�)
        ayn� array veya list'i bize  d�nd�r�r
        ancak i�indeki elementler de�i�mi� olacakt�r.

         */
        /*
        verilen 4 elemanl� bir array'i
        method'a g�nderelim.
        method'da yeni 3 elamanl� bir array atay�p
        bu yeni array'a rastgele 100'den k���k 3 say� atayal�m.
        method'da array'i yazd�ral�m

        main method'da da method call'dan sonra yeniden method'u yazd�ral�m
         */
        int[] arr = {3, 5, 8, 10};

        arrayDegistir(arr);

        System.out.println("Method D��� Arrays.toString(arr) = " + Arrays.toString(arr));


    }

    public static void arrayDegistir(int[] arr) {

        arr = new int[3];
        Random rnd = new Random();

        arr[0] = rnd.nextInt(100);
        arr[1] = rnd.nextInt(100);
        arr[2] = rnd.nextInt(100);

        System.out.println("Method i�i Arrays.toString(arr) = " + Arrays.toString(arr));

    }
}
