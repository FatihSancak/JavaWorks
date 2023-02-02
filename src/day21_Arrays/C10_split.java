package src.day21_Arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {
        String str = "Java, ne kadar guzel.";

        // Java boşluk karakterlerini bulur, yok eder ve kalan kelimeleri array'a atar ve aralarına virgül koyar
        String [] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // output: [Java, ne, kadar, guzel]

        String [] kelimelerNe = str.split("ne");
        System.out.println(Arrays.toString(kelimelerNe)); // output: [Java ,  kadar guzel]

        String [] kelimelerE = str.split("e");
        System.out.println(Arrays.toString(kelimelerE)); // output: [Java n,  kadar guz, l]

        String [] kelimelerH = str.split("");
        System.out.println(Arrays.toString(kelimelerH)); // output: [J, a, v, a, ,,  , n, e,  , k, a, d, a, r,  , g, u, z, e, l, .]
    }
}
