package src.day28_staticBlock;

public class C03_PastByValue {
    /*
    %25 indirimli fiyat� hesaplay�p bize d�nd�ren bir method olu�turun
     */

    public static void main(String[] args) {
        double satisFiyati = 100;
        double indirimOrani = 25;

        double indirimlifiyat= indirimliFiyatHesapla(satisFiyati,indirimOrani);

        System.out.println("indirimlifiyat = " + indirimlifiyat);
        System.out.println("indirimlifiyat = " + indirimlifiyat);
        System.out.println("indirimlifiyat = " + indirimlifiyat);
        System.out.println("indirimlifiyat = " + indirimlifiyat);

    }

    public static double indirimliFiyatHesapla(double satisFiyati, double indirimOrani) {

        double indirimliFiyat = satisFiyati*(1-indirimOrani/100);

        return indirimliFiyat;
    }

}
