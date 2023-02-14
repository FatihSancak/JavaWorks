package src.day30_immutable_date;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class C03_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        System.out.println(tarih); // yyyy-aa-gg
        System.out.println(tarih.getDayOfYear()); // Yýlýn Kaçýncý Günü (int)
        System.out.println(tarih.getDayOfWeek()); // Haftanýn Hangi Günü (String)
        System.out.println(tarih.getMonthValue()); // Yýlýn Kaçýncý Ayý (int)
        System.out.println(tarih.isLeapYear()); // Artýk Yýl mý? (boolean)


        System.out.println("*******************");

        // HER HANGÝ BÝR TARÝH ÜZERÝNDE ÇALIÞMAK ÝÇÝN - 1
        LocalDate tarih2 = LocalDate.of(1978, 3, 8);
        System.out.println(tarih2.getDayOfWeek());

        // HER HANGÝ BÝR TARÝH ÜZERÝNDE ÇALIÞMAK ÝÇÝN - 2
        LocalDate tarih3 = LocalDate.of(1977, Month.MARCH, 8);
        System.out.println(tarih3);

        // ÝLERÝ TARÝH
        System.out.println(tarih.plusDays(100)); //  100 gün SONRA
        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(15)); // 5 yýl 3 ay 15 gün SONRA

        // ÖNCEKÝ TARÝH
        System.out.println(tarih.minusWeeks(20)); // 20 hafta önce
        System.out.println(tarih.minusDays(100).minusMonths(3).minusYears(3)); // 100 gün, 3 ay, 3 yýl ÖNCE

        System.out.println(tarih.isAfter(tarih2)); // true

        // Ýki farklý doðum günü girildiðinde hangisinde doðanýn daha büyük olduðunu bulunuz ?

        if (tarih2.isAfter(tarih3)) {
            System.out.println(tarih3 + " tarihde doðan daha büyük");
        } else if (tarih2.isBefore(tarih3)) {
            System.out.println(tarih3 + " tarihinde doðan daha büyük");
        } else {
            System.out.println("iki tarih birbiri ile ayný");
        }
    }
}
