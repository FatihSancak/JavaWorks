package src.day16_forLoop;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {
        // Kullanıcıdan 100'den küçük bir tamsayı isteyin.
        // 1'den başlayarak girilen sayıya kadar tüm sayıları yazdırın.
        // Ancak;
        // Sayı 3'ün katı ise sayi yerine "Java" yazdırın
        // Sayı 5'in katı ise sayı yerine "Hayattır" yazdırın
        // Sayı hem 3'ün hem de 5'in katı ise sayı yerine "Java Hayattır" yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 100'deb küçük bir tam sayı giriniz : ");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if(i%3==0 && i%5==0){
                System.out.println("Java Hayattır ");
            } else if (i%3==0) {
                System.out.print("Java ");
            } else  if (i%5==0) {
                System.out.print("Hayattır ");
            }else{
                System.out.print(i+" ");
            }
        }
    }
}
