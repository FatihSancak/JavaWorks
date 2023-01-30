package src.day21_Arrays;

import java.util.Arrays;

public class C01_ArrayMaxSayiyiBulma {
    public static void main(String[] args) {
        // Verilen bir int array’daki en büyük sayıyı yazdıran bir method oluştur.

        int[] sayilar = {3,5,7,1,4,9,5,2};

        maxSayiyiYazdir(sayilar);
    }

    public static void maxSayiyiYazdir(int[] sayilar) {
        // Değer ataması yapmamamın sebebi array'ın değişken olma ihtimali vardır.
        // Bazen negatif değerlerde gelmesi ihtimaline binaen sadece tanımlama yapılıp değer atanmaz.
        // Atamak gerekirse de array'ın 0 ncı indeksi de atanabilir;
        // int maxSayi = sayilar[0];

        int maxSayi= sayilar[0];

        for (int i = 1; i < sayilar.length; i++) {
            if (sayilar[i] > maxSayi) {
                maxSayi = sayilar[i];
            }
        }
        System.out.println("Array'daki En Büyük Sayi = " + maxSayi);
    }
}