package src.day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C09_get {
    public static void main(String[] args) {
        List<Integer> sayilar1 = new ArrayList<>();

        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        List<String> isimler = new ArrayList<>();
        isimler.add("Belinay");
        isimler.add("�mer");
        isimler.add("Faruk");

        System.out.println(isimler.get(1)); // �mer
        System.out.println(sayilar1.get(0)); // 5
    }
}