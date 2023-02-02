package src.day22_multiDimensionalArrays;

import java.sql.SQLOutput;

public class C02_MdaTumElemetleriYazdirma {
    public static void main(String[] args) {
        /*
        verilen bir multi-dimensional array'in
        tüm elementlerini yazdıran bir method oluşturun
         */
        int[][] sayilar ={{1,5,6,9},{2,5,8,8},{3,1,6}};

        elementleriYazdir(sayilar);
    }

    public static void elementleriYazdir(int[][] sayilar) {
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                System.out.print(sayilar[i][j]+" ");
            }
            System.out.println();
        }
    }
}