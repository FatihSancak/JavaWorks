package src.Recap01;

public class R06_Modulus {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 5 basamaklı sayının ilk 2 ve son iki basamağındaki RAKAMLARIN toplamını bulunuz.

        Example
        input : 12345
        output : 57
         */

        int input = 35898;

        int sonIki = input % 100;
        int ilkIki = input / 1000;

        System.out.println(ilkIki+sonIki);

        int ilkIkiTop = ilkIki%10 + ilkIki / 10;
        int sonIkiTop = sonIki%10 + sonIki / 10;

        System.out.println("İşlem Sonucu : " +(ilkIkiTop+sonIkiTop));

    }
}
