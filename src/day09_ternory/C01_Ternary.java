package src.day09_ternory;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
         */
        System.out.println("Bir sayı giriniz : ");
        Scanner scan = new Scanner(System.in);
        double sayi = scan.nextDouble();

        System.out.println(sayi>=0?sayi:(-1*sayi));
    }
}
