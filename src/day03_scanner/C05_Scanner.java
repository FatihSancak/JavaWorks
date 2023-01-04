package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        /*
        Kullanıcıdan iki sayı alıp
        bu sayıların çarpımını yazdırın.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen birinci sayıyı giriniz : ");
        double sayi1 = scan.nextDouble();

        System.out.print("Lütfen ikinci sayıyı giriniz : ");
        double sayi2 = scan.nextDouble();

        double carpim = sayi1 * sayi2;

        System.out.println("Girmiş olduğunuz "+ sayi1 +" ile "+ sayi2 +" nin çarpımı = "+ carpim );

    }
}
