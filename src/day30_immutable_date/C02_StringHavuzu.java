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
        Yeni bri string oluþtururken;

        1. Eþitliðin saðýnda NEW keyword'ü olurusa Java direk yeni bir object ve referans oluþturur.

        2. Eþitliðin saðýnda bir method çalýþýyor veya + iþlemi yapýlýyorsa
           String immutable olduðundan deðiþkliði kaydetmek üzere
           hemen bir kopya String ve refeansý oluþurur.Sonra deðeri hesaplayýp bu
           yeni kopya object'in içine koyar

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
        Eðer yeni String object'i oluþturulurken
        new kelimesi kullanýlmamýþsa veya
        eþitliðin saðýnda + iþlemi olmazsa Java bakar

        Eðer daha önce oluþturulan String object'lerden (String Havuzu)
        bire-bir ayný String var o object'i ve referansý kullanýr

        Bire-bir aynýsý yoksa yeni bir object ve referans oluþturur.

        String immmutable
        Java;
        Referansýný STACK MEMORY'de,
        Deðerini ise HEAP MEMORY'de saklar.
         */
    }
}
