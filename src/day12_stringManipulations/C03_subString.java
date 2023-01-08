package src.day12_stringManipulations;

public class C03_subString {
    public static void main(String[] args) {
        String isim = "Suleyman";
        String soyisim = "Karanfil";
        String kartNo = "1234 5678 9012 3456";

        System.out.println(isim.substring(3)); // eyman
        System.out.println(soyisim.substring(soyisim.length() - 3)); // fil
        System.out.println(isim.substring(2, 4));// le

        // isim ve soyismin ilk karakterleri büyük diğerleri *
        // kredi kartının da ilk 4 hanesi görünsün diğerleri *

        String isimIlkHarf = isim.substring(0,1).toUpperCase();
        String isimKalanHarfler = isim.substring(1).replaceAll("\\w","*");

        String soyisimIlkHarf = soyisim.substring(0,1).toUpperCase();
        String soyisimKalanHarfler = soyisim.substring(1).replaceAll("\\w","*");

        String kkIlkDort = kartNo.substring(0,4);
        String kkKalanlar = kartNo.substring(4).replaceAll("\\d","*");

        System.out.println(isimIlkHarf + isimKalanHarfler + " " + soyisimIlkHarf + soyisimKalanHarfler);
        System.out.println(kkIlkDort + kkKalanlar);
    }
}
