package src.JetBrains;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Merhaba Dunya");
        System.out.println("Bir değerlendirme notu giriniz");

        Scanner scan = new Scanner(System.in);

        int sayi = scan.nextInt();

        do{
            sayi++;
            System.out.println(sayi);
        }while (sayi<10);

    }
}
