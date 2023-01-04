package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        /*
        Kullanıcıdan ismini soyismini ve yaşını alıp
        "girilen bilgiler = ali çapar 34" şeklinde yazdırın
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Lüfen isminizi giriniz : ");
        String isim = scan.nextLine();

        System.out.print("Lüfen soy isminizi giriniz : ");
        String isim2 = scan.nextLine();

        System.out.print("Lüfen Yaşınızı giriniz : ");
        double yas = scan.nextDouble();

        System.out.println("Girilen Bilgiler : "+ isim + isim2 + yas);


    }
}
