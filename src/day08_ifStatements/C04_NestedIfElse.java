package src.day08_ifStatements;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        Girdiği sayi 5’e bölünüyorsa son rakamını kontrol edin.
        Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
        Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 Basamaklı bir tamsayı giriniz");
        int sayi = scan.nextInt();

        /*
        sayınını 4 basamaklı olduğunu da kontrol
        Sayının 5'e bölünüp bölünememe
        sayının son basamağına göre
         */
        if (sayi<1000 || sayi >9999){
            System.out.println("Lütfen 4 basamaklı bir sayı giriniz");
        } else if (sayi%5==0) {
            if (sayi%10==0){
                System.out.println("Sayı 5'e bölünebilen ÇİFT sayıdır");
            }
            else{
                System.out.println("Sayı 5'e bölünebilen TEK sayıdır");
            }
        }else {
            System.out.println("sayı dört basamaklı ancak 5'e bölünememektedir.");
        }
    }
}
