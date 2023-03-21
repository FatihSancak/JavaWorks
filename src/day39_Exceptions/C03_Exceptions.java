package src.day39_Exceptions;

public class C03_Exceptions {
    public static void main(String[] args) {
        String str = "123a5";
        int sayi = 0;


        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Rakamsal de�er girilmemi�");
        }catch (Exception e) {
            System.out.println("�ng�r�lemeyen bir hata olu�tu");
        }

        System.out.println("Say�n�n karesi : " + (sayi * sayi));

        // String str2 =3; Compile Time Error

        /*
        Kullan�c�dan String olarak bir de�er al�yor
        ve bunu integer'a �eviriyorsak NumberFormatException ile
        kar��la�abilece�imizi �n g�r�r�z.
        NumberFormatException ald���m�zda kodun durmamas�n� istiyorsak
        try/catch ile �evrelemeliyiz.

        E�er bilmedi�im bir exception daha olu�ursa kod durmas�n istiyorsak
        bir kere daha catch c�mlesi ekleyip en geni� Exception'� yazabiliriz.

         */

    }
}
