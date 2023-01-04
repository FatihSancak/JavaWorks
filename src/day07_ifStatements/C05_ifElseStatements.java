package src.day07_ifStatements;

import java.util.Scanner;

public class C05_ifElseStatements {
    public static void main(String[] args) {
        /*
        Kulllanıcıdan bir karakter girmesini isteyin ve
        girilen karakterlerin harf olup olmadığını yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir karakter giriniz : ");
        char harf = scan.next().charAt(0);

        // if şartı şu şekilde olmalıdır :
        // girilen harf a'dan büyük eşitse VE (&&) z'den küçük eşitse
        // VEYA (||)
        // girilen harf A'dan büyük eşitse VE (&&) Z'den küçük eşitse
        if ((harf >= 'a' && harf <= 'z') || (harf >='A' && harf<='Z')){
            System.out.print("Girilen karakter :"+  harf  +" bir HARF'tir.");
       }
        // eğer yukarıdaki şart sağlamayan bir giriş yapıldıysa bu uyarı ekranı gelecektir.
        else {
            System.out.println("Girilen karakter :"+  harf  +" bir HARF DEĞİLDİR ");
        }
    }
}
