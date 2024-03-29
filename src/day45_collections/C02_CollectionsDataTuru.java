package src.day45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru{

    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        /*
        Coleections <dataTuru>nu Object secmeniz durumunda
        Collection'a farkli data turlerinden objeler koymaniza izin verir
        Bu depolama acisindan bize esneklik saglar
        Ancak islem yaparken tum objeleri Object olarak tanimladigimizdan
        cok fazla casting yapmamiz gerekebilir
         */

        //liste.add(5);
        //liste.add('s');
        //liste.add(true);

        List<Object> list = new ArrayList<>();
        list.add(5);
        list.add('s');
        list.add(true);
        list.add("Ali");

        System.out.println(list);

        Set<Object> set1 = new HashSet<>();
        set1.add(5);
        set1.add(true);
        set1.add('5');

    }
}