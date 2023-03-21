package src.day08_ifStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {
        /*
        SORU
        ***********************
        Kullanıcıdan 100 üzerinde notunu isteyin
        Not'u harf sisteme cevirip yazdırın;
        50'den küçükse "D",
        50'ye eşitv eya büyük 60'dan küçük  arası "C",
        60'ye eşitv eya büyük 50'dan küçük  arası  "B",
        80'nin üzeri ise "A"
        geçersiz not girildiğinde uyarı verilsin
        ***********************
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir gün ismi giriniz :  ");
        double not = scan.nextDouble();

        if (not<0 || not>100) {
            System.out.println("Geçerli bir puan giriniz.");
        }
        else if(not<50){
            System.out.println("Notunuz : D ");
        }
        else if(not<60){
            System.out.println("Notunuz : C");
        }
        else if(not<80){
            System.out.println("Notunuz : B");
        }
        else{
            System.out.println("Notunuz : A");
        }
    }
}
