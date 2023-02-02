package src.day21_Arrays;

import java.util.Arrays;

public class C07_sort {
    public static void main(String[] args) {
        int[] sayilar={5,7,1,6,4,3,9,5,7};

        // Array'i ARRAYS class'ını kullanarak sıralayabilir.
        // SORT : Sayılar için KÜÇÜKTEN BÜYÜYE DOĞRU,
        // String ise HARF SIRASINA göre sıralama yapar.
        // Natural hale getirir
        // bir kere sıralama yapar bir daha eskiye dönülemez.
        Arrays.sort(sayilar);

        System.out.println("Arrays.toString(sayilar) = " + Arrays.toString(sayilar));
        // Ekran Çıktısı : [1, 3, 4, 5, 5, 6, 7, 7, 9]
    }
}