package src.day09_ternory;

import java.util.Scanner;

public class C06_SwirtchCase {
    public static void main(String[] args) {
        /*
        Kullanıcıdan gün ismini alın
        hafta içi ve ya hafta sonu olduğunu yazdırın.
         */
        System.out.println("Bir gün ismi giriniz");
        Scanner scan = new Scanner(System.in);
        String gun = scan.next().toLowerCase();

        switch(gun){
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("Hafta İçi");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Hafta Sonu");
                break;
            default:
                System.out.println("Lütfen geçerli bir gün giriniz");                                        }
        }
    }
