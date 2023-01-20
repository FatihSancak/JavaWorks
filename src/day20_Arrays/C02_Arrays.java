package src.day20_Arrays;

import java.util.AbstractList;
import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        int sayilar[]= new int[3];
        System.out.println(sayilar); // [I@568db2f2

        // non-primitive data t�r�ndeki datalar�
        // her zaman direk yazd�ramayabiliriz.
        // stack memory'den gelen referans olarak [I@568db2f2 yazd�r�lm��t�r.
        // Array'i yazd�rmak istersek Array class'�ndan yard�m isteriz.

        System.out.println(Arrays.toString(sayilar)); // [0, 0 ,0]

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;

        //System.out.println("sayilar[2] = " + sayilar[2]);  bu komut �al��maz.

        System.out.println(Arrays.toString(sayilar)); // [5, 3, 10]

        String siniflist[]={"Ali", "Ay�e","Ahmet"};
        System.out.println(Arrays.toString(siniflist)); // [Ali, Ay�e, Ahmet]

        siniflist[1]="Hasan";
        System.out.println(Arrays.toString(siniflist)); // [Ali, Hasan, Ahmet]

        // Array'da istenilen data'n�n index'i ile �a��r�larak yazd�r�lmas�:
        System.out.println(siniflist[1]); // Hasan
        System.out.println(siniflist[0]); // Ali

    }
}