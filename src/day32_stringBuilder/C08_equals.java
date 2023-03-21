package src.day32_stringBuilder;

public class C08_equals {
    public static void main(String[] args) {
        /*
        StringBuilder'da equals() methodu ancak ayný object olurs TRUE doner
        String'deki gibi düþünmemek lazýmdýr.
         */

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";

        System.out.println(sb1.equals(sb2)); // false

        System.out.println(sb1.equals(str)); // false

        System.out.println(sb1.compareTo(sb2)); // 0

//        compareTo() method'u iki StringBuilder'ý baþtan baþlayarak
//        harf harf karþýlaþtýrýr.
//        Ýlk harfler ayný ise, ikincilere geçer
//        ikinciler ayný ise üçüncülere geçer ve
//        ilk farklý olan harfe kadar gider.
//
//        Farklý olan iki harfin ascii kodlarý arasýndaki farký verir.
//
//        Eðer hiç farklý harf yoksa
//        sonuç olarak 0 döndürür.

        StringBuilder sb3 = new StringBuilder("Jave");

        System.out.println(sb1.compareTo(sb3)); // -4
    }
}
