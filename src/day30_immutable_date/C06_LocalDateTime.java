package src.day30_immutable_date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();

        System.out.println(tarihSaat); // 2023-02-14T10:11:04.042723900

        System.out.println(tarihSaat.plusMonths(3).plusHours(100)); // 3 ay 100 saat SONRA

        System.out.println(tarihSaat.minusDays(100).plusHours(100)); // 100 gün ÖNCE 100 saat SONRA

        System.out.println(tarihSaat.toLocalDate()); // yyyy-aa-gg

    }
}
