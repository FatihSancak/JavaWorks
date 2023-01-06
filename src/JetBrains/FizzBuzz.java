package src.JetBrains;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        /*
        Fizz Buzz klasik bir programlama problemidir.
        İşte biraz değiştirilmiş versiyonu.
        Giriş olarak iki tam sayı alan bir program yazın: aralığın başı ve sonu
        (her iki sayı da aralığa aittir).
        Program bu aralıktaki sayıları çıkarmalıdır,
        ancak sayı 3'e bölünebilirse, onun yerine Fizz çıktısını almalısınız;
        sayı 5'e bölünebiliyorsa, Buzz çıktısı alın;
        ve hem 3'e hem de 5'e bölünebiliyorsa, FizzBuzz çıktısını alın.
        Her sayıyı veya kelimeyi ayrı bir satıra yazdırın.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Fizz Buzz için iki sayıdan ilkini girin > ");
        int sayi1 = scanner.nextInt();
        System.out.println("Lütfen ikinci sayıyı girin > ");
        int sayi2 = scanner.nextInt();

        int dongu = sayi2 - sayi1;

        for (;!(sayi2+1==sayi1);sayi1++){
            if(sayi1 % 15==0){
                System.out.println("FizzBuzz");
            }else if(sayi1 % 5==0){
                System.out.println("Buzz");
            }else if(sayi1 % 3==0){
                System.out.println("Fizz");
            }else{
                System.out.println(sayi1);
            }
        }
    }
}
