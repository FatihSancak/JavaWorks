package src.day18_while_whileDoWhile;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Kullanıcıdan tam sayılar alın.
        Kullanıcı ÇİFT sayı girdiği müddetçe sayıları yazdırın,
        TEK sayı girdiğinde işlemi bitirin.
         */

         Scanner scan = new Scanner(System.in);
        int sayi = 0;

        /*

        While Loop Kullanarak Çözüm

        Loop'larda kullanacağımız variable'ları loop'dan önce oluşturmalıyız.
        while loop'da, loop'dan önce oluşturduğumuz bu variable'a atayacağımız
        değeri iyi düşünmek gerekiyor. Çünkü yanlış bir atama yapılırsa loop hiç işlem girmez
        yukarıdaki
        sayi = 1 ;
        şeklinde sayi'ya atama yapıldığında while loop HİÇ çalışmayacaktır.

         */

        while (sayi%2==0) {
            System.out.println("Lütfen bir sayı giriniz");
            sayi = scan.nextInt();
            if(sayi%2==0){
                System.out.println("Girilen sayı çift : "+ sayi);
            }else{
                System.out.println("Girilen sayı tek");
            }
        }
         /*

        Do While Loop Kullanarak Çözüm
        do while loop'da önceden oluşturulan variable'a hangi değer atandığının
        hiç bir önemi yoktur. Kod her durumda çalışır.

        do while'în dezavantajı:
        İlk çalıştırma kontrol yapılmadan olduğu için loop'un body'sinde
        yanlış bir işlem yapılmamasına dikkat etmek gerekir

         */
        //sayi=0;

        do{
            System.out.println("Lütfen çift sayı giriniz");
            sayi = scan.nextInt();
            // bu kontrol yapılmazsa kullanıcı ne girerse kod ilk defa çalışır. 
            if(sayi%2==0){
                System.out.println("Girilen sayı çift : "+ sayi);
            }else{
                System.out.println("Girilen sayı tek");
            }

        }while(sayi%2==0);
    }
}
