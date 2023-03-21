package src.day32_stringBuilder;

public class C08_equals {
    public static void main(String[] args) {
        /*
        StringBuilder'da equals() methodu ancak ayn� object olurs TRUE doner
        String'deki gibi d���nmemek laz�md�r.
         */

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";

        System.out.println(sb1.equals(sb2)); // false

        System.out.println(sb1.equals(str)); // false

        System.out.println(sb1.compareTo(sb2)); // 0

//        compareTo() method'u iki StringBuilder'� ba�tan ba�layarak
//        harf harf kar��la�t�r�r.
//        �lk harfler ayn� ise, ikincilere ge�er
//        ikinciler ayn� ise ���nc�lere ge�er ve
//        ilk farkl� olan harfe kadar gider.
//
//        Farkl� olan iki harfin ascii kodlar� aras�ndaki fark� verir.
//
//        E�er hi� farkl� harf yoksa
//        sonu� olarak 0 d�nd�r�r.

        StringBuilder sb3 = new StringBuilder("Jave");

        System.out.println(sb1.compareTo(sb3)); // -4
    }
}
