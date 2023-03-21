package src.day39_Exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) {
        String str;

      /*
       System.out.println(str); // CTE hatasý
       Deðer atamasý yapmadan bir variable'ý kullanmaya çalýþýrsaný
       Java Compile Time'da bunu farkeder ve size size izin vermez.
       */

        str =null;

        // System.out.println(str.length());
        // NullPointerExcaption

        Object obj = "Java Java Java";
        Integer sayi = (Integer) obj;


        /*
        String str2 = "Falan Filan";
        Integer sayi2 = str2;

        Java bazý casting iþlemlerine Compile Time'da izin vermez.

        Ancak bazen java kodun çalýþmasýna itiraz etmez.
         */
    }
}
