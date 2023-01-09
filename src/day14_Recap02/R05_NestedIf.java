package src.day14_Recap02;

import java.util.Scanner;

public class R05_NestedIf {
    public static void main(String[] args) {
        /*
        Oy Kullanma Yaşı
        age => 18 // oy kullanamaz
        age =>70 // üç kez oy kullanabilkir
        70>age>=50 // iki kez oy kullanabilir
        50>age>=18 // bir kez oy kullanabilir
        */

//        // Kullanıdan bilgilerini alma:
//        System.out.println("Yaşınızı giriniz : ");
//        Scanner scan = new Scanner(System.in);
//
//        double yas = scan.nextDouble();
        double yas = 50;

        if (yas<=18){
            System.out.println("Oy kullanamazsınız");
        }else if(yas<50){
            System.out.println("BİR kez oy kullanabilirsiniz");
        }else if(yas<70){
            System.out.println("İKİ kez oy kullanabilirsiniz");
        }else if (yas>=70){
            System.out.println("ÜÇ kez oy kullanabilirsiniz");
        }



    }
}
