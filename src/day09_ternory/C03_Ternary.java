package src.day09_ternory;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayı isteyin.
        Sayı pozitifse yazdırın.
        Sayı sıfır veya negatifse bir sayı daha isteyin ve ikisinin çarpımını yazdırın.
         */
        System.out.println("Bir sayı girin: ");
        Scanner scan = new Scanner(System.in);
        double sayi = scan.nextDouble();

        if(sayi>0){
            System.out.println(sayi);
        }else{
            System.out.println("Bir sayı girin: ");
            double sayi2 = scan.nextDouble();
            System.out.println(sayi*sayi2);
        }
        /*
        Eğer if-else içerisine yeni kodlar varsa
        ternary ile yapmak mümkün değildir.
         */
    }
}