package src.day16_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {
        /*
        Kullanıcıdan iki sayı isteyin
        Girilen sayılar ve aralarındaki tüm tam sayıları toplayıp
        sonucu yazdıran bir method yazın
         */
        int sayi1, sayi2,toplam;
        sayi1 = 12;
        sayi2 = 10;

        aralariTopla(sayi1, sayi2);

    }
    public static void aralariTopla(int sayi1, int sayi2) {
        int toplam = 0;
        if(sayi1<sayi2) {
            for (int i = sayi1; i <= sayi2; i++) {
                toplam += i;
            }
            System.out.println("Girdiğiniz " + sayi1 + " ile " + sayi2 + " arasındaki sayıların toplamı = " + toplam);

        // eğer önce BÜYÜK sayı girilmişse
        }else {
            for (int i = sayi2; i <=sayi1; i++) {
                toplam += i;
            }
            System.out.println("Girdiğiniz " + sayi1 + " ile " + sayi2 + " arasındaki sayıların toplamı = " + toplam);
        }
    }
}
