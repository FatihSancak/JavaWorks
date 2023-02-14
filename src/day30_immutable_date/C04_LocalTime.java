package src.day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time1 = LocalTime.now();
        System.out.println(time1); // 09:38:16.274696100 (nano saniye)
        /*
        Oluþturduðumuz date ve time canlý saat veya tarih deðildir.
        LocalTime.now() kullanýldýðý satýrda o andaki tarih veya saati
        alýr variable store eder.

        time1 variable'nýn deðeri SABITTIR
         */

        Thread.sleep(3000); // 3 Saniye gecikme

        time1=LocalTime.now();
        System.out.println(time1); // 09:38:16.274696100 (nano saniye)

        System.out.println(time1.getSecond()); // saniye bölümünü getir
        System.out.println(time1.plusSeconds(10000)); // 10000 saniye sonrasý
        System.out.println(time1.minusMinutes(200)); // 200 dakika öncesi
        System.out.println("time1.withHour(3) = " + time1.withHour(3));
    }
}
