package src.day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {
    public static void main(String[] args) {

        Queue<String> ll3=new LinkedList();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Polat");
        ll3.add("Kadir");

        // Queue kuyruk demektir, s�ra onemlidir
        // gelen sona gelir, giden ba�tan gider

        System.out.println(ll3); // [Adem, Zeynep, Polat, Kadir]

        System.out.println(ll3.remove()); // Adem

        System.out.println(ll3); // [Zeynep, Polat, Kadir]

        System.out.println(ll3.remove("Polat")); // true

        System.out.println(ll3); // [Zeynep, Kadir]

        System.out.println(ll3.element()); // Zeynep
        System.out.println(ll3.peek()); // Zeynep

        Queue<String> ll4=new LinkedList();
        //System.out.println(ll4.element()); //throws exception NoSuchElementException

        System.out.println(ll4.peek()); // null
        // peek ve element silmeden ilk elementi bize dondurur
        // aralarindaki fark bos liste olursa peek null doner,
        // element exception firlatir

        ll3.offer("Ahmet");
        ll3.offer("Sefa");
        System.out.println(ll3); // [Zeynep, Kadir, Ahmet, Sefa]

        System.out.println(ll3.poll()); // Zeynep

        System.out.println(ll3); // [Kadir, Ahmet, Sefa]

        //System.out.println(ll4.remove()); // throws exception NoSuchElementException
        System.out.println(ll4.poll()); // null

    }
}
