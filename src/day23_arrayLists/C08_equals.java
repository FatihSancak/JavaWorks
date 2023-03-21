package src.day23_arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C08_equals {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();

        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String> urunler2 = new ArrayList<>();
        urunler2.add("Ikram");
        urunler2.add("Nutella");
        urunler2.add("Cay");
        urunler2.add("Cekirdek");

        System.out.println(urunler.equals(urunler2)); // false

        /*
        *  �r�nlerin s�ralamalar� farkl� oldu�undan sonuc FALSE d�ner
        *  ancak her iki listede �ncelikle s�ralan�r sonra
        *  equals method'u �al��t�r�l�rsa sonu� TRUE d�ner
        */

        Collections.sort(urunler);
        Collections.sort(urunler2);

        System.out.println(urunler.equals(urunler2)); // true

    }
}
