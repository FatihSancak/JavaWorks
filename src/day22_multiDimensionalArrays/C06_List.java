package src.day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        /*
        array2in array yapan sembol [] idi,
        arrayList deise <> diamond(elmas) kullanılır
         */

        List<String> isimler = new ArrayList<>();
        System.out.println(isimler); // []

        // ArrayList'e eleman ekleme
        isimler.add("Başar");

        System.out.println(isimler.add("Demek")); // true doner

        /*
        String'de bir method çalıştırdığımızda
        assign ypmazsak String değişmiyordu

        String isim = "Suleyman"
        isim.toUpperCase() // SULEYMAN
        sout(isim) --> Suleyman
         */
        System.out.println(isimler);
        /*
        List'in tek kotu tarafı array alt yapısını kullandığı için
        elemanları birer birer eklemek zorunda olmamızdır
         */

    }
}
