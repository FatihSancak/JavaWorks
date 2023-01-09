package src.day14_Recap02;

public class R09_NestedIfAndTernary {
    public static void main(String[] args) {
        /*
        0-9 arasındaki sayıları kelimelere çevirebilen bir java programı yazın.
        kelimelere, sayı 9'dan büyükse veya sıfırdan küçükse
        çıkış " geçersiz" olmalıdır

        NestedIf ve Ternary kullanarak 2 yolla da çözünüz.
         */

        int sayi = 9;
        String sonuc = "";

        if (sayi >= 0 && sayi <= 9) {
            if (sayi == 0) {
                sonuc = "Sıfır";
            }
            if (sayi == 1) {
                sonuc = "Bir";
            }
            if (sayi == 2) {
                sonuc = "iki";
            }
            if (sayi == 3) {
                sonuc = "üç";
            }
            if (sayi == 4) {
                sonuc = "dört";
            }
            if (sayi == 5) {
                sonuc = "beş";
            }
            if (sayi == 6) {
                sonuc = "altı";
            }
            if (sayi == 7) {
                sonuc = "yedi";
            }
            if (sayi == 8) {
                sonuc = "sekiz";
            }
            if (sayi == 9) {
                sonuc = "dokuz";
            }
        } else {
            System.out.println("Geçerli bir sayı giriniz");
        }

        System.out.println("NextedIF Sonuc = " + sonuc);
        System.out.print("Ternary Sonuc  = ");
        System.out.print(+sayi == 1 ? "bir" : +
                sayi == 2 ? "iki" : +
                sayi == 3 ? "üç" : +
                sayi == 4 ? "dört" : +
                sayi == 5 ? "beş" : +
                sayi == 6 ? "altı" : +
                sayi == 7 ? "yedi" : +
                sayi == 8 ? "sekiz" : +
                sayi == 9 ? "dokuz" : +
                sayi == 0 ? "sıfır" : "0 ile 9 arasında bir sayı giriniz");
    }
}