package src.day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();

        urunler.add("Nutella");
        urunler.add("Ýkram");
        urunler.add("Çekirdek");
        urunler.add("Çay");
        /*
        remove() iki þekilde çalýþýr
        1- objeyi yazýp silmesini istersek bize boolean sonuc doner true/false
        2- index girersek o index'deki elemani siler ve bize silinen elemaný döndürür.
         */

        System.out.println(urunler); // [Nutella, Ýkram, Çekirdek, Çay]

        System.out.println(urunler.remove("Ýkram")); // true

        System.out.println(urunler); // [Nutella, Çekirdek, Çay]

        System.out.println(urunler.remove("Hobby")); // false

        System.out.println(urunler); // [Nutella, Çekirdek, Çay]

        // ikinci yöntem

        urunler.remove(1); // 1. indexi
        System.out.println(urunler);

        // olmayan bir indexi silmeye çalýþýrsak
        // urunler.remove(3);
        // IndexOutOfBoundsException hatasý verir
    }
}