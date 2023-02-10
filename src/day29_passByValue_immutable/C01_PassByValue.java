package src.day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        4 elemanl� bir array olu�tural�m.
        sonra ay�r bir method'da
        bu array'in 2. ve 4. elemanlar�n�
        100'den k���k rastgele bir say� ile de�i�tirelim
        ve yeni halini yazd�ral�m.
         */

        int[] arr = {5, 7, 8, 10};

        System.out.println(arr); // REFERANS DE�ER�
        elemanDegistir(arr);


        System.out.println("elemanDegistir Methodu �al��t�ktan sonra = " + Arrays.toString(arr));

        /*
        Array'lar referans de�erleri STOCK memmory'de bulundurmakta
        de�erleri ise HEAP memory'de saklanmaktad�r.
        bu sebeple de�i�imler kal�c� olur.
         */
    }

    public static void elemanDegistir(int[] arr) {
        Random rnd = new Random();
        arr[1] = rnd.nextInt(100);
        arr[3] =rnd.nextInt(100);

        System.out.println("Method'un i�inden\t\t\t\t\t\t = "+Arrays.toString(arr)); // [5, rnd, 8, rnd]
        System.out.println(arr); // REFERANS DE�ER� DE���MEZ
    }
}
