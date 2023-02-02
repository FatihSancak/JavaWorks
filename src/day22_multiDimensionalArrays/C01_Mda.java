package src.day22_multiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {
        /*
        tek katlı array'lerde array'i direk yazdıramıyoruz.
         çünkü array non-primitve data türüdür.
         Her non-primitive data direk yazdırılamayabilir.

         Ancak array içindeki elemenetleri direk yadırılabilir.
         çünkü genelde primitive data  türü veya String elemenetler kullanılıyordu.
         Multidimensional array'larda en dikkat edeceğimiz konu
         ulaşmak istediğimiz elementin bir array mi yoksa
         primitive data mı olduğudur.
         */

        int[][] sayilar = {{1,2,4,5},{3,4}};

        /*
        burada sayılar array'ını düşünürsek içinde 2 tane inner array var.
        sayılar[0] --> {1,2,4,5}

        ancak en içerdeki elemenetlere ulaşırsak direk yazdırabiliriz.
         */
        System.out.println(sayilar[0]); // [I@568db2f2 şeklinde referans çıktı verecektir.

        System.out.println(Arrays.toString(sayilar[0])); // [1, 2, 4, 5]

        System.out.println(sayilar[0][1]); // 2

        System.out.println(sayilar[1][0]); // 3

        System.out.println(Arrays.toString(sayilar));// [[I@568db2f2, [I@378bf509]

        System.out.println(Arrays.deepToString(sayilar));// deepToString --> [[1, 2, 4, 5], [3, 4]]

        /*
        Array'i iki şekilde declare edebiliriz
        1- Elemanları direk yazabiliriz

        int[][] sayilar = {{1,24,5}, {3,4}};

        2- outer ve inner array'lerin uzunluklarını belirleyerek oluşturabiliriz.

        int[][] sayilar = new int[3][4];

        ancak 2. yöntemle yapılan inner array'lerin farklı uzunlukta olma  ihtimali kalmaz.
        bu örnek için outer array2in 3 tane inner array'i vardır
        her bir inner array'in ise 4'er elamanı vardır.

        eğer inner array'leri farklı uzunluklarda oluşturmak istiyorsanız
        mecburen 1. yöntem kullanılmalı.
         */
    }
}