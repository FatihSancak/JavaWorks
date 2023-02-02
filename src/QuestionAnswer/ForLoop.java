package src.QuestionAnswer;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // FOR LOOP SORULARI VE ÇÖZÜMLERİ
        // Soru : 1
        // Ekrana 10 kez "Java Hayattır" yazdırın
        for (int i = 0; i < 10 ; i++) {
                System.out.println(i+"Java Hayattır");
        }
        System.out.println("");
        System.out.println("*******************");
        // Soru : 2
        // 10 ile 30 arasındaki (10 ve 30 dahil) sayıları aralarında
        // virgül olarak aynı sayırda yazdırın

        for (int i = 10; i <=30 ; i++) {
            System.out.print(i);
            if (i!=30){
                //         System.out.print(",");
            }
        }
        System.out.println("");
        System.out.println("*******************");

        // Soru : 3
        // 100'den başlayarak 50'ye (dahil) kadar olan sayıları
        // aralarında virgül olarak aynı sayırda yazdırın

        for (int i = 100; i >= 50; i--) {
            System.out.print(i);
            if(i!=50){
                //System.out.print(",");
            }
        }
        System.out.println("");
        System.out.println("*******************");

        // Soru : 4
        // Kullanıcıdan 100'den küçük bir tam sayı isteyin.
        // 1'den başlayarak girilen sayıya kadar 3'ün katı
        // olan sayıları yazdırın

        //System.out.print("Lütfen bir sayı giriniz : ");
        Scanner scan = new Scanner(System.in);

        //int input = scan.nextInt();
        int input = 10;
        if (input>100){
            System.out.println("Lütfen 100'den küçük bir sayı giriniz"); // 100'den küçük olma şartının kontrolü
        }else {
            for (int j = 1; j < input; j++) {
                if (j % 3 == 0) {
                    System.out.print(j + " ");
                }
            }
        }
        System.out.println("");
        System.out.println("*******************");

        // Soru : 5
        // Kullanıcıdan 100'dem küçük bir tam sayı isteyin.
        // 1'den başlayarak girilen sayıya kadar
        // 3'ün veya 5'in katı olan sayıları yazdırın

        //System.out.print("100'den küçük bir sayı giriniz");
        // int input2  = scan.nextInt();

        int input2 = 10;
        if(input2>100){
            System.out.println("Lütfen 100'den küçük bir sayı giriniz");
        }else{
            for (int i = 1; i < 100 ; i++) {
                if(i%3==0 && i%5==0) {
                    System.out.print(i+" ");
                }
            }
        }
        System.out.println("");
        System.out.println("*******************");

        // Soru : 6 ****
        // Kullanıcıdan 100'den küçük bir tamsayı isteyin.
        // 1'den başlayarak girilen sayıya kadar tüm sayıları yazdırın.
        // Ancak;
        // Sayı 3'ün katı ise sayi yerine "Java" yazdırın
        // Sayı 5'in katı ise sayı yerine "Hayattır" yazdırın
        // Sayı hem 3'ün hem de 5'in katı ise sayı yerine "Java Hayattır" yazdırın

        System.out.println("Lütfen bir sayı giriniz : ");
        int sayi = scan.nextInt();

        for (int i = 1; i <=sayi; i++) {
            if(i%3==0 && i%5==0){
                System.out.println("Java Hayattır");
            } else if (i%3==0) {
                System.out.println("Java");
            } else  if (i%5==0) {
                System.out.println("Hayattır");
            }else{
                System.out.println(i);
            }
        }
    }
}
