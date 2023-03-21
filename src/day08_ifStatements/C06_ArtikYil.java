package src.day08_ifStatements;

import java.util.Scanner;

public class C06_ArtikYil {
    public static void main(String[] args) {
        System.out.println("Lütfen artık yıl kontrol için bir yıl giriniz ");
        Scanner scan= new Scanner(System.in);

        int yil = scan.nextInt();

        if(yil%4!=0) {
            System.out.println("Artık yıl değil");
        } else if (yil%100!=0) {
            System.out.println("Artık yıl");
        }else if (yil%400!=0) {
            System.out.println("Artık yıl değil");
        }else{
            System.out.println("Artık yıl");
       
        }
    }
}
