package src.day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time1 = LocalTime.now();
        System.out.println(time1); // 09:38:16.274696100 (nano saniye)
        /*
        Olu�turdu�umuz date ve time canl� saat veya tarih de�ildir.
        LocalTime.now() kullan�ld��� sat�rda o andaki tarih veya saati
        al�r variable store eder.

        time1 variable'n�n de�eri SABITTIR
         */

        Thread.sleep(3000); // 3 Saniye gecikme

        time1=LocalTime.now();
        System.out.println(time1); // 09:38:16.274696100 (nano saniye)

        System.out.println(time1.getSecond()); // saniye b�l�m�n� getir
        System.out.println(time1.plusSeconds(10000)); // 10000 saniye sonras�
        System.out.println(time1.minusMinutes(200)); // 200 dakika �ncesi
        System.out.println("time1.withHour(3) = " + time1.withHour(3));
    }
}
