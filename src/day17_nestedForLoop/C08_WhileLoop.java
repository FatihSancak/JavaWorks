package src.day17_nestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {
        /*
        kullanicidan toplanmak üzere sayılar alın.
        sayıların toplamı 500'ü geçince
        sayıların toplamının ve kaç sayı toplandığını
        şu şekilde yazdırın;
        13 sayı girdiniz ve toplamları 567
         */
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int sayi = 0;
        int sayac = 0;

        while(toplam<500){
            System.out.println("Lütfen bir sayı giriniz : ");
            sayi = scan.nextInt();
            toplam += sayi;
            sayac++;
        }
        System.out.printf(sayac+" adet sayı girdiniz ve bu sayıların toplamı :" + toplam);
    }
}
