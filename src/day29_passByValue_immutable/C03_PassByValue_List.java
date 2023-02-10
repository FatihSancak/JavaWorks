package src.day29_passByValue_immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue_List {
    public static void main(String[] args) {
        /*
        bir list oluþturalým
        iki ayrý mthod'dan birinde
        sadece elemanlarý deðiþtirelim

        diðerinde yeni bri list atayýp
        ayný sayýda yeni eleman ekleyelim

        ve her iki method call'dan sonra kendi listemizi
        main method içinden kontrol edelim.
         */

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");

        System.out.println("Ýlk baþta list :  "+list);
        //[Ali, Veli, Can]

        elemalariDegistir(list); // [Oðuz, Murat, Fatih]

        System.out.println("eleman deðiþtir methodundan sonra list :  "+list);
        // [Oðuz, Murat, Fatih]

        listDegistir(list); // [Nutella, Çay, Çokokrem]

        System.out.println("liste  deðiþtir methodundan sonra list :  "+list);
        // [Oðuz, Murat, Fatih]
    }

    public static void listDegistir(List<String> list) {
        list = new ArrayList<>();
        list.add("Nutella");
        list.add("Çay");
        list.add("Çokokrem");

        System.out.println("List deðiþtir methounda list: "+ list);
        // [Nutella, Çay, Çokokrem]

    }

    public static void elemalariDegistir(List<String> list) {
        list.set(0,"Oðuz");
        list.set(1,"Murat");
        list.set(2,"Fatih");

        System.out.println("Eleman deðiþtir methounda list : "+ list);
        // [Oðuz, Murat, Fatih]
    }
}
