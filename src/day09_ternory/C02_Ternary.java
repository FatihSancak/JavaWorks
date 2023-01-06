package src.day09_ternory;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin.
        Sayi pozitifse “Sayi pozitif” yazdirin,
        negatifse sayinin karesini yazdirin
         */
        System.out.println("Bir sayı girin: ");
        Scanner scan = new Scanner(System.in);
        double sayi = scan.nextDouble();

        System.out.println(sayi>0 ? "Sayı Pozitif":sayi*sayi);
    }
}
