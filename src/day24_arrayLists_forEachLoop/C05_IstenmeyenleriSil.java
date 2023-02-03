package src.day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_IstenmeyenleriSil {
    public static void main(String[] args) {
        // Verilen bir array�de istenmeyen harf i�eren
        // kelimeleri silipi kalan elementleri yeni bir array yap�n

        String[] sehirler = {"Istanbul", "Ankara", "Mersin", "Konya", "Kastamonu", "Izmir"};

        String istenmeyenHarf = "o";

        // �stenmeyen harflerin bulundurmayan �ehirler eklenmesi i�in "kalanlar" isimli bir liste olu�turulmas�
        List<String> kalanlar = new ArrayList<>();

        // sehirler array'i i�inde d�nerek istenmeyen harfin BULUNMADI�I �ehirlerin "kalanlar" listesine eklenmesi
        for (int i = 0; i < sehirler.length; i++) {
            if (!sehirler[i].contains(istenmeyenHarf)) {
                kalanlar.add(sehirler[i]);
            }
        }

        // "kalanlar" listesini aktarmak i�in yeni bir "kalanlarArray"� olu�turma
        String[] kalanlarArrayi = new String[kalanlar.size()];

        // "kalanlar" listesindeki bilgileri "kalanlarArray"�na aktarma
        for (int i = 0; i < kalanlarArrayi.length; i++) {
            kalanlarArrayi[i] = kalanlar.get(i);
        }

        // "k"alanlarArray"�n� "sehirler" array'�na aktarma
        sehirler = kalanlarArrayi;

        System.out.println(Arrays.toString(sehirler));
    }
}