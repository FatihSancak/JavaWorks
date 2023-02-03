package src.day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C08_OrtakElemalariBulma {
    public static void main(String[] args) {
        // iki String array olusturunuz ve
        // bu array�lerdeki ortak elemanlari For-each loop kullanarak bulunuz.
        // Sonucu ekrana yazdiriniz.
        // Ortak eleman yoksa ekrana �Ortak eleman yok� yazdiriniz

        String[] arr1 = {"Ali", "Veli", "Ay�e"};
        String[] arr2 = {"Ali", "Hasan", "Ay�e", "Enes"};

        List<String> ortakIsimler = new ArrayList<>();

        // her iki array'deki bilgileri i� i�e d�ng� ile d�nerek benzer olanlar��n� listeye ekleme.
        for (String each1 : arr1
        ) {
            for (String each2 : arr2) {
                if (each1.equalsIgnoreCase(each2)) {
                    ortakIsimler.add(each1);
                }
            }
        }
        // Bizden istenilene g�re ekrana bilgi g�nderimi
        if (ortakIsimler.isEmpty()) {
            System.out.println("Hi� ortak eleman yok");
        } else {
            System.out.println("Her iki array'deki ortak isimler " + ortakIsimler);
        }
    }
}