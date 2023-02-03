package src.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapmak {
    public static void main(String[] args) {
        /*
        List ile çalýþýrken en kötü özelliði elemanlarý tek tek eklemektir.
         */

       Integer[] arr = {2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0};

        /*
         *  List'e  kadar çok elemanlý bir listeyi tek tek eleman olarak girmek yerine
         * array oluþturup, for loop ile oluþturduðunuz List'e taþýyabilirsiniz.
         */

        List<Integer> sayilar = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]
        /*
        * Bu iþlemi yapmasý için Java'nýn oluþturduðu bir method daha var
        * ancak bu yöntemin çok yan etkisi vardýr.
        *
        * 1 - Arrays.asList(arr); þeklinde oluþturulan listede  add, remove
        * gibi size'i deðiþtiren method'lar KULLANILAMAZ
        *
        * 2 - asList() method'u ile oluþturulan liste ile kaynak olan array
        * birbiri ile iliþik olarak hayatlarýna devam ederler
        * birinde yapýlan deðiþiklik otomatik olarak diðerine de iþler
        *
         */


        List<Integer> sayilar2 = Arrays.asList(arr);
        System.out.println(sayilar2); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        sayilar.add(5);
        System.out.println(sayilar); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0, 5]

        // UnsupportedOperationException HATA VERECEKTÝR !
        //
        // sayilar2.add(5);
        // System.out.println(sayilar2); // UnsupportedOperationException

        arr[0]=20;
        System.out.println(Arrays.toString(arr));
        System.out.println("Arrayda deðiþiklik yapýnca sayýlar2: " +sayilar2);
    }
}