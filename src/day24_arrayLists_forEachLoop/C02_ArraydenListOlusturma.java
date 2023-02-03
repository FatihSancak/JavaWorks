package src.day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturma {
    public static void main(String[] args) {
        /*
        Ýçinde 200 tane 1000'den büyük pozitif tamsayý olan bir
        list oluþturun kullanýcýdan bir sayý isteyip
        listede var olup olmadýðýný kullanýcýya dönün
         */
        Random rnd = new Random();

        int sayi = 0;
        List<Integer> sayiListesi = new ArrayList<>();

        while (sayiListesi.size() < 200) {
            sayi = rnd.nextInt(1000);
            // listeyi kontrol ederek içinde tekrar eden rakamlarý kontrolü
            if (!sayiListesi.contains(sayi)) {
                sayiListesi.add(sayi);
            }
        }
        System.out.println(sayiListesi);

        boolean bildiMi = false;
        int tahminSayisi = 1;

        Scanner scan = new Scanner(System.in);
        while (!bildiMi) {  // bildiMi == false
            System.out.println("Lütfen bir sayý tahmini giriniz");
            sayi = scan.nextInt();
            if (sayiListesi.contains(sayi)) {
                System.out.println("Tebrikler ! \n" + tahminSayisi + " adet tahminde listedeki sayýyý buldunuz");
                bildiMi = true;
            } else {
                System.out.println(tahminSayisi + " adet sayý girdiniz. Ancak girdiðiniz sayýlar listede yok");
                tahminSayisi++;
            }
        }
    }
}