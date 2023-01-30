package src.day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
    /*      binarySearch()
    ------------------------------------------------------
    binarysearch : Javada elaman aramanın kısa yoludur
    ancak binarySearch'ün çalışması için Array'ın sıralı
    hale (SORT) getirilmesi gereklidir.
    ------------------------------------------------------
    Eğer sıralama yapmadan binarySearch kullanımında
    sonucu bulamayabilir veya yanlış sonuca ulaşılabilir.
    ------------------------------------------------------
    binarySearch, aranılan elamanın indexini int olarak döndürür.
     */

        String[] harfler = {"Y", "B", "D", "G", "O"};

        String arananHarf = "O";

        // Sıralanmış Dizi
        Arrays.sort(harfler);
        System.out.println("Arrays.toString(harfler) = " + Arrays.toString(harfler));
        System.out.println("C03_Contains.contains(harfler,arananHarf) = " + C03_Contains.contains(harfler, arananHarf));

        // binarySearch ile dönen index değeri
        System.out.println(Arrays.binarySearch(harfler, arananHarf));

    }
}