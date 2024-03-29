package src.day23_arrayLists;

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
        say�lardan olu�an bir list varsa Java remove() method'unda
        say� yazd���m�zda direk index olarak kabul eder.
        illa da 5'i silsin dersek
        silinecek objcet'i bir variable'a tan�mlayabiliriz
        */

        Integer sil = 5;
        sayilar1.remove(sil);
        System.out.println("sayilar1 = " + sayilar1);// [2, 1]

        // veya indexOf() method'undan yard�m alabilirim.
        // 2' yi silmek i�in 2'nin index'ini bulup onu remove'a yazabiliriz.
        sayilar1.remove(sayilar1.indexOf(2));
        System.out.println(sayilar1); // [1]
    }
}