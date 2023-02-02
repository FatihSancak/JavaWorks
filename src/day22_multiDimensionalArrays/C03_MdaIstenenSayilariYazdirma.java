package src.day22_multiDimensionalArrays;

public class C03_MdaIstenenSayilariYazdirma {
    public static void main(String[] args) {
        /*
        verilen 2 katlı bir multi dimensional array'de
        outer index'i ve inner index'i aynı olan sayıların toplamını bulunuz

         int[][] sayilar ={{1,5,6,9},{2,5,8,8},{3,1,6}};

         [0][0]  + [1][1]+ [2][2] ....

         */

        int[][] sayilar = {{1, 5, 6, 9}, {2, 5, 8, 8}, {3, 1, 6}, {1, 1, 1, 1}};

        // 0 0 - 1
        // 1 1 - 5
        // 2 2 - 6
        // toplam = 12

        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {

            for (int j = 0; j < sayilar[i].length; j++) {
                if (i == j) {
                    toplam += sayilar[i][j];
                }
            }
        }
        System.out.println(toplam);
    }
}