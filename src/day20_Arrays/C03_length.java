package src.day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_length {
    public static void main(String[] args) {

        // iki þekilde Array oluþturulabilir;

        int sayilar[]={1,2,3};
        String harfler[] = new String[4];

        System.out.println("Sayýlar Array'in uzunluðu : "+sayilar.length); // 4

        // String length() method'unda parantez var,
        // Array'da ise yoktur.

        System.out.println("Harfler Array'inin uzunluðu : "+harfler.length); // 3
        System.out.println("Arrays.toString(harfler) = " + Arrays.toString(harfler)); // [null, null, null, null]

        // harfler array'inin son elemenetini yazdýralým.
        System.out.println(harfler[harfler.length - 1]);

        // Array geniþliðinin dýþýndaki bir index istenirse
        // Java yazým sýrasýnda bir hata uyarýsý vermez.
        // Ancak çalýþtýrýldýðýnda Run Time Error olarak;
        // ArrayIndexOutOfBoundsException hatasý verir
        // --> System.out.println(harfler[5]);


    }
}
