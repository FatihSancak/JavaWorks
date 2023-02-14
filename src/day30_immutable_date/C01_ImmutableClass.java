package src.day30_immutable_date;

import java.util.ArrayList;
import java.util.List;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Kenan");
        list.add("Ali");
        list.add("Mustafa");
        System.out.println(list); // [Kenan, Ali, Mustafa]

        list.set(1,"Yasemin");
        System.out.println(list); // [Kenan, Yasemin, Mustafa]

        list.remove("Mustafa");
        System.out.println(list); // [Kenan, Yasemin]

    }
}
