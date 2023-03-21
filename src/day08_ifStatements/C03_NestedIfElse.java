package src.day08_ifStatements;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {
         /*
         emeklilik kontorlü yapan bir program yazınız
         cinsiyet olarak E (erkek) veya K (kadın) değişkenleri kabul edilsin
         farklı bir harf ve sembol girilise hata mesajı versin

         emeklilik için kadınlarda yaş sınırı 60
         erkeklerde 65 olsun
         negatif yas veya 80'den buyuk yas girilirse hata mesajı versin
          */

        Scanner scan = new Scanner(System.in);
        System.out.println("Emeklilik Durumunuzu görmek için istenene bilgileri giriniz");
        System.out.print("Lütfen Cinsiyetinizi Giriniz : ");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.print("Lütfen Yaşınızı Giriniz : ");
        double yas = scan.nextDouble();

        if (cinsiyet =='E'){
            if (yas<0 || yas > 80 ){
                System.out.println("Emeklilik yaşı aralığında değilsiniz.");
            } else if (yas<65) {
                System.out.println("Emekli olamazsınız");
            }else{
                System.out.println("Emekli olabilirsiniz");
            }
        }else if (cinsiyet=='K'){
            if (yas<0 || yas > 60 ){
                System.out.println("Emeklilik yaşı aralığında değilsiniz.");
            } else if (yas<60) {
                System.out.println("Emekli olamazsınız");
            }else{
                System.out.println("Emekli olabilirsiniz");
            }
        }else {
            System.out.println("Lütfen geçerli bir cinsiyet girişi yapınız.");
        }
    }
}
