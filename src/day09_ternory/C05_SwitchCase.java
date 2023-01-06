package src.day09_ternory;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        /*
        Kullanıcıdan gün numarasını alıp 1 ise pazarttesi .. 7 ise pazar yazdıralım.
         */
        System.out.println("Bir sayı giriniz");
        Scanner scan = new Scanner(System.in);
        int gunno = scan.nextInt();

        switch(gunno){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Geçerli gün numarası giriniz");
        }
    }
}