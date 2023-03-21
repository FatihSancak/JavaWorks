package src.day23_arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();

        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        Collections.sort(urunler);
        System.out.println(urunler); // [Cay, Cekirdek, Ikram, Nutella]

        /*
        List ile gelen sort method'unda sýralama özelliðini girmek gerekiyor
        bunun yerine COLLECTIONS class'ýndan sort method'unu kullanýyoruz.
        bu method listemizi natural order'a (doðal sýralama) göre sýralar
         */

    }
}