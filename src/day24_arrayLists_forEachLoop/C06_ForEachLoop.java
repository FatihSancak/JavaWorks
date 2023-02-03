package src.day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 23, 6, 8, 9, 1};
        List<Integer> liste = new ArrayList<>();

        // Array'deki tüm elemanlarý inceleyelim tek sayý olanlarý list'e atama

        for (int each : arr // gelecek datalarýn TÜRÜ, loop içindeki kullanýlacak ÝSÝM ve NEREDEN alýndýðý
        ) {
            if (each % 2 == 1) {
                liste.add(each);
            }
        }
        System.out.println(liste);
    }
}