package src.day30_immutable_date;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class C03_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        System.out.println(tarih); // yyyy-aa-gg
        System.out.println(tarih.getDayOfYear()); // Y�l�n Ka��nc� G�n� (int)
        System.out.println(tarih.getDayOfWeek()); // Haftan�n Hangi G�n� (String)
        System.out.println(tarih.getMonthValue()); // Y�l�n Ka��nc� Ay� (int)
        System.out.println(tarih.isLeapYear()); // Art�k Y�l m�? (boolean)


        System.out.println("*******************");

        // HER HANG� B�R TAR�H �ZER�NDE �ALI�MAK ���N - 1
        LocalDate tarih2 = LocalDate.of(1978, 3, 8);
        System.out.println(tarih2.getDayOfWeek());

        // HER HANG� B�R TAR�H �ZER�NDE �ALI�MAK ���N - 2
        LocalDate tarih3 = LocalDate.of(1977, Month.MARCH, 8);
        System.out.println(tarih3);

        // �LER� TAR�H
        System.out.println(tarih.plusDays(100)); //  100 g�n SONRA
        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(15)); // 5 y�l 3 ay 15 g�n SONRA

        // �NCEK� TAR�H
        System.out.println(tarih.minusWeeks(20)); // 20 hafta �nce
        System.out.println(tarih.minusDays(100).minusMonths(3).minusYears(3)); // 100 g�n, 3 ay, 3 y�l �NCE

        System.out.println(tarih.isAfter(tarih2)); // true

        // �ki farkl� do�um g�n� girildi�inde hangisinde do�an�n daha b�y�k oldu�unu bulunuz ?

        if (tarih2.isAfter(tarih3)) {
            System.out.println(tarih3 + " tarihde do�an daha b�y�k");
        } else if (tarih2.isBefore(tarih3)) {
            System.out.println(tarih3 + " tarihinde do�an daha b�y�k");
        } else {
            System.out.println("iki tarih birbiri ile ayn�");
        }
    }
}
