package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lüfen isminizi giriniz : ");
        String isim = scan.nextLine();

        System.out.print("Lüfen soy isminizi giriniz : ");
        String isim2 = scan.nextLine();

        System.out.print("Lüfen Yaşınızı giriniz : ");
        double yas = scan.nextDouble();

        System.out.println("Girilen Bilgileriniz \n İsminiz : "+ isim +
                "\n Soyisminiz : " + isim2 +
                "\n Yaşınız : " + yas) ;

    }
}
