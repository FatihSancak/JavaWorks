package src.day07_ifStatements;

import java.util.Scanner;

public class C04_BasitIfStatements {
    public static void main(String[] args) {
        /*
        Kullanıcıdan gün ismini alın.
        hafta içi veya hafta sonu olduğunu yazdırın
        örnek :
        input: Salı output: "Hafta içi"
        input:Pazar output: "Hafta sonu"

        *** String için equels metodunu kullanın
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir gün giriniz : ");
        String girilenGun = scan.next();

        if(girilenGun.equals("pazar") || girilenGun.equals("cumartesi")){
            System.out.println("Girilen Gün Hafta Sonu");
        }

        if(girilenGun.equals("pazartesi") || girilenGun.equals("salı")
                || girilenGun.equals("çarşamba") || girilenGun.equals("perşembe")
                || girilenGun.equals("cumar")){
            System.out.println("Hafta İçi");
        }

        if(!(girilenGun.equals("pazartesi") || girilenGun.equals("salı")
                || girilenGun.equals("çarşamba") || girilenGun.equals("perşembe")
                || girilenGun.equals("cuma"))){
            System.out.println("Geçerli Bir Gün Giriniz");

        }
    }
}
