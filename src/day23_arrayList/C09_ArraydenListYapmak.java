package src.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapmak {
    public static void main(String[] args) {
        /*
        List ile �al���rken en k�t� �zelli�i elemanlar� tek tek eklemektir.
         */

       Integer[] arr = {2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0};

        /*
         *  List'e  kadar �ok elemanl� bir listeyi tek tek eleman olarak girmek yerine
         * array olu�turup, for loop ile olu�turdu�unuz List'e ta��yabilirsiniz.
         */

        List<Integer> sayilar = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]
        /*
        * Bu i�lemi yapmas� i�in Java'n�n olu�turdu�u bir method daha var
        * ancak bu y�ntemin �ok yan etkisi vard�r.
        *
        * 1 - Arrays.asList(arr); �eklinde olu�turulan listede  add, remove
        * gibi size'i de�i�tiren method'lar KULLANILAMAZ
        *
        * 2 - asList() method'u ile olu�turulan liste ile kaynak olan array
        * birbiri ile ili�ik olarak hayatlar�na devam ederler
        * birinde yap�lan de�i�iklik otomatik olarak di�erine de i�ler
        *
         */


        List<Integer> sayilar2 = Arrays.asList(arr);
        System.out.println(sayilar2); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        sayilar.add(5);
        System.out.println(sayilar); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0, 5]

        // UnsupportedOperationException HATA VERECEKT�R !
        //
        // sayilar2.add(5);
        // System.out.println(sayilar2); // UnsupportedOperationException

        arr[0]=20;
        System.out.println(Arrays.toString(arr));
        System.out.println("Arrayda de�i�iklik yap�nca say�lar2: " +sayilar2);
    }
}