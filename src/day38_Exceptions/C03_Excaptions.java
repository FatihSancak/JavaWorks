package src.day38_Exceptions;

import java.util.Scanner;

public class C03_Excaptions {
    public static void main(String[] args) {
        /*
        *   Marketteki tüm ürünleri bir array'da tuttuðumuzu varsayýn
        *   Kullanýcýya index sorup, o index'deki ürünü yazdýran bir
        *   program hazýrlayýn
        *
        *   Kullanýcý ürün sayýsýndan büyük bir index girerse
        *   exception vermesinin önüne geçelim
        *  */

        String[] urunler = {"Nutella","Çokokrem","Süt","Çay","Fýndýk"};

        Scanner scan = new Scanner(System.in);
        System.out.println("Ýstediðiniz ürün sýra nosunu giriniz");
        int istenenSira = 0;


        try {
            istenenSira = scan.nextInt();
        } catch (Exception deneme) {
            //throw new RuntimeException(e);
            System.out.println("Sayýsal bir deðer giriniz.");
            System.out.println("deneme.getMessage() = " + deneme.getMessage());
            deneme.getStackTrace();
            /*
            Catch bloðunun önündeki parantezde
            exception class'ýnýn ismi ve yanýnda
            yakalanan exception'ý atadýðýmýz variable'in ismi olur (e)

            Eðer yakalanan exception ile ilgili bilgileri
            kullanýcýya vermek isterseniz
            bu object'i kullanabilirsiniz.
            */
        }

        try {
            System.out.println("Aradýðýnýz ürün "+ urunler[istenenSira-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //throw new RuntimeException(e);
            System.out.println("Girdiðiniz index sirasý listemizde bulunmuyor. "
                    +"\nSýra numarasý en fazla : "+ urunler.length + " olabilir");
        }
    }
}
