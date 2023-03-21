package src.day39_exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    public static void main(String[] args) {
        // Soru: Kullanicidan yasini girmesini isteyin.
        // Kodunuzu kullanici sifirdan kucuk bir sayi
        // girerse Exception verecek sekilde yazin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Konsolda g�rmek i�in ya��n�z� giriniz: ");
        int yas = scan.nextInt();


        try {
            if(yas<0){
                throw new IllegalArgumentException();
            }else{
                System.out.println("Ya��n�z : "+yas);
            }
        } catch (IllegalArgumentException e) {
           e.printStackTrace();
           System.err.println("Ya� negatif olamaz.");
        }
    }
}
