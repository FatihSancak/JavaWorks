package src.day10_stringManupilation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {
        String str  ="Her yeni gun yeni bir umuttur.";

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
    }
}
