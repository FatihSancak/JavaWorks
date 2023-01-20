package src.day20_Arrays;

import java.util.AbstractList;
import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        int sayilar[]= new int[3];
        System.out.println(sayilar); // [I@568db2f2

        // non-primitive data türündeki datalarý
        // her zaman direk yazdýramayabiliriz.
        // stack memory'den gelen referans olarak [I@568db2f2 yazdýrýlmýþtýr.
        // Array'i yazdýrmak istersek Array class'ýndan yardým isteriz.

        System.out.println(Arrays.toString(sayilar)); // [0, 0 ,0]

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;

        //System.out.println("sayilar[2] = " + sayilar[2]);  bu komut çalýþmaz.

        System.out.println(Arrays.toString(sayilar)); // [5, 3, 10]

        String siniflist[]={"Ali", "Ayþe","Ahmet"};
        System.out.println(Arrays.toString(siniflist)); // [Ali, Ayþe, Ahmet]

        siniflist[1]="Hasan";
        System.out.println(Arrays.toString(siniflist)); // [Ali, Hasan, Ahmet]

        // Array'da istenilen data'nýn index'i ile çaðýrýlarak yazdýrýlmasý:
        System.out.println(siniflist[1]); // Hasan
        System.out.println(siniflist[0]); // Ali

    }
}