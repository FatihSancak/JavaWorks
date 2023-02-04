package src.day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_remove {
    public static void main(String[] args) {
        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        sayilar1.add(1);

        System.out.println(sayilar1); // [5, 3, 2, 1]
        sayilar1.remove(1);

        System.out.println(sayilar1); // [5, 2, 1]

        /*
        sayýlardan oluþan bir list varsa Java remove() method'unda
        sayý yazdýðýmýzda direk index olarak kabul eder.
        illa da 5'i silsin dersek
        silinecek objcet'i bir variable'a tanýmlayabiliriz
        */

        Integer sil = 5;
        sayilar1.remove(sil);
        System.out.println("sayilar1 = " + sayilar1);// [2, 1]

        // veya indexOf() method'undan yardým alabilirim.
        // 2' yi silmek için 2'nin index'ini bulup onu remove'a yazabiliriz.
        sayilar1.remove(sayilar1.indexOf(2));
        System.out.println(sayilar1); // [1]
    }
}