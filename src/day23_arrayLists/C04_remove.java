package src.day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();

        urunler.add("Nutella");
        urunler.add("�kram");
        urunler.add("�ekirdek");
        urunler.add("�ay");
        /*
        remove() iki �ekilde �al���r
        1- objeyi yaz�p silmesini istersek bize boolean sonuc doner true/false
        2- index girersek o index'deki elemani siler ve bize silinen eleman� d�nd�r�r.
         */

        System.out.println(urunler); // [Nutella, �kram, �ekirdek, �ay]

        System.out.println(urunler.remove("�kram")); // true

        System.out.println(urunler); // [Nutella, �ekirdek, �ay]

        System.out.println(urunler.remove("Hobby")); // false

        System.out.println(urunler); // [Nutella, �ekirdek, �ay]

        // ikinci y�ntem

        urunler.remove(1); // 1. indexi
        System.out.println(urunler);

        // olmayan bir indexi silmeye �al���rsak
        // urunler.remove(3);
        // IndexOutOfBoundsException hatas� verir
    }
}