package src.day14_Recap02;

public class R07_SwitchCase {
    public static void main(String[] args) {
        /*
        SWITCH CASE İLE;

        Günleri gösterebilen bir program yazın.
        gün Pazartesi ve ya Salı ise "Java Dersleri Günü"
        gün Perşembe veya Cuma ise "Selenyum Dersleri Günü"
        gün Çarşamba veya Cumartesi ise "SQL Dersleri Günü"
        aksi halde "İzin Günü"

        yazdırın
         */

        String gun ="Çarşamba" ;
        String msg="";

        switch (gun) {
            case "Pazartesi" -> msg = "Java Dersleri Günü";
            case "Salı" -> msg = "Java Dersleri Günü";
            case "Çarşamba" -> msg = "Selenyum Dersleri Günü";
            case "Perşembe" ->msg = "SQL Dersleri Günü";
            case "Cuma" -> msg = "SQL Dersleri Günü";
            case "Cumartesi" -> msg = "Selenyum Dersleri Günü";
            case "Pazar" -> msg = "İzin Günü";
            default -> msg="Bir gün Girmediniz";
        }
        System.out.println("msg = " + msg);
        /*
        Switch yazım teknikleri

        switch(condition){
            case "****" -> sout;
            case "**" -> sout;
            default -> sout;
        }

        *******************
        switch(condition){
            case "****":
                sout;
                break;
            case "**"
                sout;
                break;
            default:
                sout;
        }

        */
    }
}
