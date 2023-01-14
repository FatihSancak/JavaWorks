package src.day14_MethodCreation;
import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        /*
        EĞER BİR CLASS'IN İÇİNDE HERHANGİ BİR HESAPLAMA YAPIP
        BUNU DA KALICI OLARAK SAKLAMAK İSTERSEK
        KODUMUZU SADE VE ANLAŞILABİLİR TUTMAK İÇİN
        İŞLEMİ BİR METHOD'DA YAZIP
        SONUCUNU MAIN METHOD'A DÖNDÜREBİLİRİZ.
        RETURN TYPE'I VOID OLMAYAN BİR METHOD'UN SONUCUNU
        MAIN METHOD'DA BİR VARIABLE'A ATAMA YAPARSAK
        PROGRAMIN GERI KALANINDA BU YENİ DEĞERİ KULLANMA İMKANINA SAHİP OLURUZ.
         */


        // kullanıcıdan şehir ismini ve doğum tarihini alıp
        // bunları programda kullanacağınız formatta bize döndüren bir method oluşturun
        // şehir ismini programınızda büyük harf olarak
        // tarihi 2023-01-14 şeklinde kullanın

        String sehir = sehirAl();
        String tarih = tarihAl();
        System.out.println("Girdiğini şehir : "+ sehir);
        System.out.println("Girdiğiniz tarih :" + tarih);
    }

    public static String tarihAl() {
        String tarih = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Yıl giriniz");
        int yil = scan.nextInt();

        if (yil > 1900 && yil < 2100) {
            tarih = yil + "-";
        } else {
            System.out.println("Yıl için geçerli bir sayı yazmalısınız ( 1900 - 2100 )");
        }

        System.out.println("Kaç ay olduğunu tamsayı olarak yazın");
        int ay = scan.nextInt();

        if (ay <= 0 || ay > 12) {
            System.out.println("Ay no 1-12 arasında olmalıdır");
        } else if (ay < 10) {
            tarih = tarih + "0" + ay + "-";
        } else {
            tarih = tarih + ay + "-";
        }

        System.out.println("Kaçıncı gün olduğunu yazınız");
        int gun = scan.nextInt();

        if(gun<=0 || gun>31){
            System.out.println("Gün için 1-31 aradında bir sayı giriniz");
        } else if (gun<10) {
            tarih = tarih+"0"+gun;
        }else{
            tarih = tarih+gun;
        }
        return  tarih;
    }

    public static String sehirAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sehir bilgisini giriniz");
        String sehirAdi = scan.next().toUpperCase();
        return sehirAdi;
   }
}