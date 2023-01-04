package day03_scanner;

import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {
        /*
        Kullanıcıdan ilk harfini alarak ilk harfini büyük olarak yazdırın
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen İsminizi Giriniz : ");

        char ilkHarf = scan.next().toUpperCase().charAt(0);

        // Java Scanner class'ında nextChar methodu yoktur.
        // Bunun yerine String olarak alıp onun da ilk harfini alabilriiz.
        //

        System.out.println("İsmin ilk harfi : " + ilkHarf);
    }
}
