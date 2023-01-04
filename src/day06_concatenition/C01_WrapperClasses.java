package day06_concatenition;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        /*
        Wrapper class; Javanın hazır metodaları kullanabilmemiz için primitive data türlerinin
        her biri için açtığı class'lardır.

        int --> Integer
        char --> Character
        byte --> Byte
        long --> Long
        float --> Float
        double --> Double
        short --> Short
         */
        String str = "Java ile hayat ne güzel";

        System.out.println(str.toUpperCase());

        boolean guzelMi = true;
        // boolean primitve olduğundan hazır metodu bulunmuyor.

        Boolean buGuzelMi = true;

//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Short.MIN_VALUE);

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı bir sayı giriniz");

        String sifre = scan.nextLine();
        Integer sifreSayi =Integer.parseInt(sifre);

        System.out.println("Girilen STRING şifrenin 3 fazlası " + (sifre+3));
        System.out.println("Girilen INTEGER şifresnin 3 fazlası "+ (sifreSayi+3));
        /*
        Wrapper Class'lar ileride kullanabileceğimiz bir çok hazır method içerir.
         */
    }
}
