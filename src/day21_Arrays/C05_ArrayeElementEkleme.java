package src.day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {
        //Verilen bir array’a yeni bir element ekleyen method oluşturun

        String[] sinifListesi = {"Ali Can", "Nida", "Musa"};

        String eklenecekIsim = "Murat";

        sinifListesi = elemanEkle(sinifListesi, eklenecekIsim);

        System.out.println(Arrays.toString(sinifListesi));

    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {

        // Eski Array'dan 1 elaman fazla uzunlukta yeni listeye oluşturma
        // örnek çıktı :
        // yeniSinifListesi[]={null, null}
        String[] yeniSinifListesi = new String[sinifListesi.length + 1];

        // eski Array'da bulunan tüm elamanları yeni listeye taşıma
        for (int i = 0; i < sinifListesi.length; i++) {
            yeniSinifListesi[i] = sinifListesi[i];
        }

        // Yeni Array'a eklenecek veriyi de son index olarak ekleme
        yeniSinifListesi[yeniSinifListesi.length - 1] = eklenecekIsim;

        return yeniSinifListesi;
    }
}
