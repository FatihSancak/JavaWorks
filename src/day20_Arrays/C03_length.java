package src.day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_length {
    public static void main(String[] args) {

        // iki �ekilde Array olu�turulabilir;

        int sayilar[]={1,2,3};
        String harfler[] = new String[4];

        System.out.println("Say�lar Array'in uzunlu�u : "+sayilar.length); // 4

        // String length() method'unda parantez var,
        // Array'da ise yoktur.

        System.out.println("Harfler Array'inin uzunlu�u : "+harfler.length); // 3
        System.out.println("Arrays.toString(harfler) = " + Arrays.toString(harfler)); // [null, null, null, null]

        // harfler array'inin son elemenetini yazd�ral�m.
        System.out.println(harfler[harfler.length - 1]);

        // Array geni�li�inin d���ndaki bir index istenirse
        // Java yaz�m s�ras�nda bir hata uyar�s� vermez.
        // Ancak �al��t�r�ld���nda Run Time Error olarak;
        // ArrayIndexOutOfBoundsException hatas� verir
        // --> System.out.println(harfler[5]);


    }
}
