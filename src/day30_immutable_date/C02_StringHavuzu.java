package src.day30_immutable_date;

public class C02_StringHavuzu {
    public static void main(String[] args) {
        String hiclik = "";
        String str1 = "Ali Can";
        String str2 = str1 + "";
        String str3 = new String("Ali Can");
        String str4 = str1.concat(hiclik);

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1 == str2); // false

        System.out.println(str1.equals(str3)); // true
        System.out.println(str1 == str3); // false

        System.out.println(str2.equals(str4)); // true
        System.out.println(str2 == str4); // false

        System.out.println("s1 - s4 " + str1.equals(str4)); // true
        System.out.println("s1 - s4 " + (str1 == str4)); // true

        /*
        Yeni bri string olu�tururken;

        1. E�itli�in sa��nda NEW keyword'� olurusa Java direk yeni bir object ve referans olu�turur.

        2. E�itli�in sa��nda bir method �al���yor veya + i�lemi yap�l�yorsa
           String immutable oldu�undan de�i�kli�i kaydetmek �zere
           hemen bir kopya String ve refeans� olu�urur.Sonra de�eri hesaplay�p bu
           yeni kopya object'in i�ine koyar

         */

        String str5 = "Ali Can";
        String str6 = str1;

        System.out.println(str1.equals(str5)); // true
        System.out.println(str5 == str1); // true

        System.out.println(str1.equals(str6)); // true
        System.out.println(str1 == str6); // true

        System.out.println(str5.equals(str6)); // true
        System.out.println((str5 == str6)); // true

        /*
        E�er yeni String object'i olu�turulurken
        new kelimesi kullan�lmam��sa veya
        e�itli�in sa��nda + i�lemi olmazsa Java bakar

        E�er daha �nce olu�turulan String object'lerden (String Havuzu)
        bire-bir ayn� String var o object'i ve referans� kullan�r

        Bire-bir ayn�s� yoksa yeni bir object ve referans olu�turur.

        String immmutable
        Java;
        Referans�n� STACK MEMORY'de,
        De�erini ise HEAP MEMORY'de saklar.
         */
    }
}
