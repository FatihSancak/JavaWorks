package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {
        // kullanıcıdan 4 basamaklı bir sayı alın ve rakamları toplamını yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 4 basamaklı bir sayı giriniz : ");
        int sayi = scan.nextInt(); // 5267
        int girilenSayi = sayi;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        // şu anda sayı : 5267 bb=0, rt=0
        birlerBasamagi= sayi % 10; // 7
        rakamlarToplami += birlerBasamagi;
        sayi/=10; // sayi değişkenini 10'a bölüp sayi değişkenine tekrar atama yapıldı.

        // sayi=526 bb=7, rt=7 oldu.
        birlerBasamagi = sayi % 10; // 6 + 7
        rakamlarToplami += birlerBasamagi;
        sayi/=10;

        // sayi= 52 bb= 6 rt=13 oldu;
        birlerBasamagi = sayi % 10; // 2 + 6 + 7
        rakamlarToplami += birlerBasamagi;
        sayi/=10;

        // sayi=5 bb= 2 rt=15 oldu;
        birlerBasamagi = sayi % 10; // 5 + 2 + 6 + 7
        rakamlarToplami += birlerBasamagi;

        System.out.println("Girilen "+ girilenSayi +" 'nın rakamlar toplamı : "+ rakamlarToplami );

    }
}