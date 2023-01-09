package src.day14_Recap02;
public class R08_SwitchCase_IQ {
    public static void main(String[] args) {

        // Girilen üç haneli bir sayıyının okunusunu yazı ile yazdırın

        int sayi = -594;

        int a = sayi%10, b = (sayi/10)%10, c = sayi/100;

//        System.out.println("birler = " + a);
//        System.out.println("onlar = " + b);
//        System.out.println("yüzler = " + c);
//        System.out.println("sayi = " + sayi);

       String yuz = "";
       String on = "";
       String bir = "";

       if (sayi>99 && sayi<1000) {

           switch (c) {
               case 1 -> yuz = "Yüz";
               case 2 -> yuz = "İki Yüz";
               case 3 -> yuz = "Üç Yüz";
               case 4 -> yuz = "Dört Yüz";
               case 5 -> yuz = "Beş Yüz";
               case 6 -> yuz = "Altı Yüz";
               case 7 -> yuz = "Yedi Yüz";
               case 8 -> yuz = "Sekiz Yüz";
               case 9 -> yuz = "Dokuz Yüz";
               default -> yuz = "";
           }

           switch (b) {
               case 1 -> on = "On";
               case 2 -> on = "Yirmi";
               case 3 -> on = "Otuz";
               case 4 -> on = "Kırk";
               case 5 -> on = "Elli";
               case 6 -> on = "Atmış";
               case 7 -> on = "Yetmiş";
               case 8 -> on = "Seksen";
               case 9 -> on = "Doksan";
               default -> on = "";
           }

           switch (a) {
               case 1 -> bir = "Bir";
               case 2 -> bir = "İki";
               case 3 -> bir = "Üç";
               case 4 -> bir = "Dört";
               case 5 -> bir = "Beş";
               case 6 -> bir = "Altı";
               case 7 -> bir = "Yedi";
               case 8 -> bir = "Sekiz";
               case 9 -> bir = "Dokuz";
               default -> bir = "";
           }
           System.out.println("Sayimiz : "+ sayi +"\nYazıyla : "+yuz+" "+on+" "+bir);
       }else{
           System.out.println("Üç basamaklı bir pozitif sayı giriniz.");
       }

    }
}

