package src.day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf{
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();

        urunler.add("Nutella");
        urunler.add("Ýkram");
        urunler.add("Çekirdek");
        urunler.add("Çay");

        System.out.println(urunler);
        System.out.println(urunler.indexOf("Ýkram")); // index sýrasý : 1
        System.out.println(urunler); // [Nutella, Ýkram, Çekirdek, Çay]

        /*
        indexOf() methodu bize bilgi döndüren bir method'dur
        listemizi deðiþtirmez.
         */

        /*
        indexOf method'u aramaya 0 ncý indexten baþlar
        lastIndexOf() method'u ise aramya son indexten baþlar
         */
        urunler.add("Ýkram");
        System.out.println(urunler); // [Nutella, Ýkram, Çekirdek, Çay, Ýkram]
        System.out.println(urunler.indexOf("Ýkram")); // 1
        System.out.println(urunler.lastIndexOf("Ýkram")); // 4

        System.out.println(urunler.indexOf("Hobby")); // -1
        System.out.println(urunler.lastIndexOf("Hobby")); // -1
    }
}