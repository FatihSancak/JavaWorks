package src.day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_IstenmeyenleriSil {
    public static void main(String[] args) {
        // Verilen bir array’de istenmeyen harf içeren
        // kelimeleri silipi kalan elementleri yeni bir array yapýn

        String[] sehirler = {"Istanbul", "Ankara", "Mersin", "Konya", "Kastamonu", "Izmir"};

        String istenmeyenHarf = "o";

        // Ýstenmeyen harflerin bulundurmayan þehirler eklenmesi için "kalanlar" isimli bir liste oluþturulmasý
        List<String> kalanlar = new ArrayList<>();

        // sehirler array'i içinde dönerek istenmeyen harfin BULUNMADIÐI þehirlerin "kalanlar" listesine eklenmesi
        for (int i = 0; i < sehirler.length; i++) {
            if (!sehirler[i].contains(istenmeyenHarf)) {
                kalanlar.add(sehirler[i]);
            }
        }

        // "kalanlar" listesini aktarmak için yeni bir "kalanlarArray"ý oluþturma
        String[] kalanlarArrayi = new String[kalanlar.size()];

        // "kalanlar" listesindeki bilgileri "kalanlarArray"ýna aktarma
        for (int i = 0; i < kalanlarArrayi.length; i++) {
            kalanlarArrayi[i] = kalanlar.get(i);
        }

        // "k"alanlarArray"ýný "sehirler" array'ýna aktarma
        sehirler = kalanlarArrayi;

        System.out.println(Arrays.toString(sehirler));
    }
}