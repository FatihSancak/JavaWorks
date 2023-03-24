package src.day44_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    // Soru 4) Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        ListIterator<Integer> li1 = liste.listIterator();

        /*
         Sondan baþa gidebilmek için cursor'un en sona gitmesi gerekir.
         bunun için while döngüsü ile sona gidilir
         */

        System.out.println("liste = " + liste);

        while (li1.hasNext()){
            li1.next();
        }

        while (li1.hasPrevious()){
            System.out.print(li1.previous()+ " "); // 40 14 45 23 56 13 2
        }
    }
}
