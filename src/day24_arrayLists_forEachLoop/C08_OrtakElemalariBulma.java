package src.day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C08_OrtakElemalariBulma {
    public static void main(String[] args) {
        // iki String array olusturunuz ve
        // bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz.
        // Sonucu ekrana yazdiriniz.
        // Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

        String[] arr1 = {"Ali", "Veli", "Ayþe"};
        String[] arr2 = {"Ali", "Hasan", "Ayþe", "Enes"};

        List<String> ortakIsimler = new ArrayList<>();

        // her iki array'deki bilgileri iç içe döngü ile dönerek benzer olanlarýýný listeye ekleme.
        for (String each1 : arr1
        ) {
            for (String each2 : arr2) {
                if (each1.equalsIgnoreCase(each2)) {
                    ortakIsimler.add(each1);
                }
            }
        }
        // Bizden istenilene göre ekrana bilgi gönderimi
        if (ortakIsimler.isEmpty()) {
            System.out.println("Hiç ortak eleman yok");
        } else {
            System.out.println("Her iki array'deki ortak isimler " + ortakIsimler);
        }
    }
}