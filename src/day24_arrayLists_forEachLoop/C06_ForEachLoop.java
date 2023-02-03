package src.day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 23, 6, 8, 9, 1};
        List<Integer> liste = new ArrayList<>();

        // Array'deki t�m elemanlar� inceleyelim tek say� olanlar� list'e atama

        for (int each : arr // gelecek datalar�n T�R�, loop i�indeki kullan�lacak �S�M ve NEREDEN al�nd���
        ) {
            if (each % 2 == 1) {
                liste.add(each);
            }
        }
        System.out.println(liste);
    }
}