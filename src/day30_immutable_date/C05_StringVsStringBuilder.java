package src.day30_immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        /*
        String mi yoksa StringBuilder m� daha h�zl�d�r?

        Bunun i�in bir String olu�turup 1000 kere sonuna nokta ekleyelin.
        �ncesinde ve sonras�nda zaman� al�p aradaki fark� bulal�m

        Ayn� i�lemi StringBuilder i�in de yap�n
         */

        // String
        String str = "Ahh Java";
        LocalTime t1 = LocalTime.now();

        for (int i = 0; i < 10000; i++) {
            str += ".";
        }
        LocalTime t2 = LocalTime.now();
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("String S�resi : " + (t2.getNano() - t1.getNano()));

        System.out.println("*********************");


        // StringBuilder
        StringBuilder sb = new StringBuilder("Ahh Java");
        t1 = LocalTime.now();

        for (int i = 0; i < 10000; i++) {
            sb.append(".");
        }
        t2 = LocalTime.now();
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("StringBuilder S�resi : " + (t2.getNano() - t1.getNano()));
    }
}
