package src.day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf{
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();

        urunler.add("Nutella");
        urunler.add("�kram");
        urunler.add("�ekirdek");
        urunler.add("�ay");

        System.out.println(urunler);
        System.out.println(urunler.indexOf("�kram")); // index s�ras� : 1
        System.out.println(urunler); // [Nutella, �kram, �ekirdek, �ay]

        /*
        indexOf() methodu bize bilgi d�nd�ren bir method'dur
        listemizi de�i�tirmez.
         */

        /*
        indexOf method'u aramaya 0 nc� indexten ba�lar
        lastIndexOf() method'u ise aramya son indexten ba�lar
         */
        urunler.add("�kram");
        System.out.println(urunler); // [Nutella, �kram, �ekirdek, �ay, �kram]
        System.out.println(urunler.indexOf("�kram")); // 1
        System.out.println(urunler.lastIndexOf("�kram")); // 4

        System.out.println(urunler.indexOf("Hobby")); // -1
        System.out.println(urunler.lastIndexOf("Hobby")); // -1
    }
}