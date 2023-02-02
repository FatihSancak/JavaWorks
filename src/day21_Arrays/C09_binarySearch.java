package src.day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {
        /*
        binarySearch method'u sıralanmış array'da aradığımız elementin index'ini döndürür.

        Ya aradığımız element array'da yoksa?
        (String'de indexOf() bize olmayan elementler için -1 döndürüyordu.)

        Aradığımız element array'^da yoksa Java hem olmadığını
        hem de olsaydı nerede olacağını bize döndürür.

        Olmadığını ifade için eksi kullanır.
        olsaydı nerede olacağını belirtmek için index değil SIRALAMA kullanır.
         */
        int[] sayilar = {3,7,15,4,27,10};

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar)); // [3, 4, 7, 10, 15, 27]

        System.out.println(Arrays.binarySearch(sayilar,4)); // 1. index

        System.out.println(Arrays.binarySearch(sayilar,15)); // 4. index

        System.out.println(Arrays.binarySearch(sayilar,11)); // -5. sırada

        System.out.println(Arrays.binarySearch(sayilar,6)); // -3. sırada (yani 4 ile 7 arasıında)

        System.out.println(Arrays.binarySearch(sayilar,-100)); // 1. sırada olmadığı için negatif olur

    }
}