package src.day31_timeFormater_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {
        LocalDateTime tarihSaat = LocalDateTime.now();

        System.out.println(tarihSaat); // 2023-02-16T10:08:10.114280300

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/M/yy hh:mm");
        System.out.println(dtf1.format(tarihSaat)); // 16/2/23 10:11

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm");
        System.out.println(dtf2.format(tarihSaat)); // 16/Þub/2023 10:12

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm:ss a");
        System.out.println(dtf3.format(tarihSaat)); // Perþembe, Þub 16, 2023 10:17:53 ÖÖ

        /*

        Model	            Örnek
        yyyy-MM-dd( iso )	“2018-07-14”
        dd-MMM-yyyy	        “14-Temmuz-2018”
        dd/MM/yyyy	        “14/07/2018”
        E, MMM dd yyyy	    “Cmt, 14 Temmuz 2018”
        h:mm a	            “12:08”

        EEEE, MMM dd, yyyy HH:mm:ss a	“14 Temmuz 2018 Cumartesi 14:31:06”
        yyyy-MM-dd'T'HH:mm:ssZ	        “2018-07-14T14:31:30+0530”
        hh 'o''clock' a, zzzz	        “Saat 12:00, Pasifik Yaz Saati”
        K:mm a, z	                    “0:08 ÖS, PDT”

         */

    }

}
