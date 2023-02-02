package src.day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_Lists {
    public static void main(String[] args) {
        /*
        List<int> sayilar = new ArrayList<>();

        List primitive data türlerini kabul etmez.
        (Type argument cannot be of primitive type)
        */
        List<Integer> sayi = new ArrayList<>();
        sayi.add(5);
        sayi.add(3);
        sayi.add(7);

        System.out.println(sayi); // [5, 3, 7]
        // Sadece add() kullanırsak Java eklenecek bilgiyi listenin sonuna ekler

        sayi.add(2,10);
        System.out.println(sayi); // [5, 3, 10, 7]
        // add(index, element) istediğimiz index'e istediğimiz elementi yerleştirir
        // add methodu elementleri silmez veya update etmez, yeni element ekler.
    }
}
