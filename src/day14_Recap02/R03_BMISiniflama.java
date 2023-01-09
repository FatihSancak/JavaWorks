package src.day14_Recap02;

import java.util.Scanner;

public class R03_BMISiniflama {
    public static void main(String[] args) {
        /*
        Kullanıcının boyunu CM ve kilosunu KG olarak BMI (VKI) hesaplayınız

        BMI = kilo(kg) / (boy*boy) cm
        20<BMI oldukca zayıfsınız
        20<BMI<25 Normal
        25<BMI<30 Şişman
        30<BMI Obez
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Boyunuzu CM olarak giriniz");
        double boy = scan.nextDouble()/100; // metreye cevirilmeis gerekiyor
        System.out.println("Kilonuzu KG olarak giriniz");
        double kilo = scan.nextDouble();

        double sonuc = kilo / (boy*boy);
        System.out.println("sonuc = " + sonuc);

        if (sonuc<20){
            System.out.println("Zayıfsınız");
        }else if (sonuc<=25){
            System.out.println("Normal");
        } else if (sonuc<=30) {
            System.out.println("Şişman");
        } else if (sonuc>30) {
            System.out.println("OBEZ");
        }
    }
}





