package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // kullanıcıdan ismini isteyin
        // girilen ismini "İsminiz : ..... " şeklinde yazdırın

        // İnsanların dünyasından kodlarımızın bulunduğu class'a değer almak için
        // Scanner class'ını kullanırız.

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen İsmini Giriniz : ");

        System.out.println("Girmiş olduğunuz isminiz : " + scan.nextLine() );


    }
}
