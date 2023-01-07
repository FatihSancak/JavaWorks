package src.day10_stringManupilation;

public class C01_charAt {
    public static void main(String[] args) {
        String str = "Java öğrenmek ne güzel";
        System.out.println(str.charAt(0)); // İlk harfi döndürü : J
        System.out.println(str.toUpperCase().charAt(7)); // 7. karakteredeki harfi büyük harfi getirir.R
        System.out.println(str.charAt(21)); // l
        // Son harfi almak için
        System.out.println(str.length());

    }
}