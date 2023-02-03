package src.day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturma {
    public static void main(String[] args) {
        /*
        ��inde 200 tane 1000'den b�y�k pozitif tamsay� olan bir
        list olu�turun kullan�c�dan bir say� isteyip
        listede var olup olmad���n� kullan�c�ya d�n�n
         */
        Random rnd = new Random();

        int sayi = 0;
        List<Integer> sayiListesi = new ArrayList<>();

        while (sayiListesi.size() < 200) {
            sayi = rnd.nextInt(1000);
            // listeyi kontrol ederek i�inde tekrar eden rakamlar� kontrol�
            if (!sayiListesi.contains(sayi)) {
                sayiListesi.add(sayi);
            }
        }
        System.out.println(sayiListesi);

        boolean bildiMi = false;
        int tahminSayisi = 1;

        Scanner scan = new Scanner(System.in);
        while (!bildiMi) {  // bildiMi == false
            System.out.println("L�tfen bir say� tahmini giriniz");
            sayi = scan.nextInt();
            if (sayiListesi.contains(sayi)) {
                System.out.println("Tebrikler ! \n" + tahminSayisi + " adet tahminde listedeki say�y� buldunuz");
                bildiMi = true;
            } else {
                System.out.println(tahminSayisi + " adet say� girdiniz. Ancak girdi�iniz say�lar listede yok");
                tahminSayisi++;
            }
        }
    }
}