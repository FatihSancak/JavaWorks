package src.day39_Exceptions;

public class C03_Exceptions {
    public static void main(String[] args) {
        String str = "123a5";
        int sayi = 0;


        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Rakamsal deðer girilmemiþ");
        }catch (Exception e) {
            System.out.println("Öngörülemeyen bir hata oluþtu");
        }

        System.out.println("Sayýnýn karesi : " + (sayi * sayi));

        // String str2 =3; Compile Time Error

        /*
        Kullanýcýdan String olarak bir deðer alýyor
        ve bunu integer'a çeviriyorsak NumberFormatException ile
        karþýlaþabileceðimizi ön görürüz.
        NumberFormatException aldýðýmýzda kodun durmamasýný istiyorsak
        try/catch ile çevrelemeliyiz.

        Eðer bilmediðim bir exception daha oluþursa kod durmasýn istiyorsak
        bir kere daha catch cümlesi ekleyip en geniþ Exception'ý yazabiliriz.

         */

    }
}
