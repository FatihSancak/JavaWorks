package src.day24_arrayLists_forEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {
        String[] arr={"Ismail","Nurullah","Fatih"};
        /*
        *  Uzun listeler oluþturmamýz gerektiðinde
        * tek tek eklemek yerine array oluþturup, bunlarý list'e çevirmek
        * daha pratik olabilir:
        * 1- Loop ile array'deki tüm elementleri List'e atayabiliriz.
        * 2- Arrays.asList() kullanabiliriz
        *    Ancak bu method'un 2 tane kotü yan etkisi vardýr.
        *    - Array Class'ý kullanýldýðý için array özellikleri geçerli olur
        *      dolayýsýyla list'te olan addd, remove gibi size'i deðiþtiren method'lar
        *      bu þekilde oluþturulan list'lerde kullanýlamaz.
        *    - kaynak olan array ile ürün olan List özdeþleþtirilir.
        *      birinde yapýlan deðiþiklik, otomatik olarak diðerine de iþlenir
         */

        List<String> sinifList = Arrays.asList(arr);

        System.out.println(sinifList); // [Ismail, Nurullah, Fatih]

        // 1. yan etki
        // sinifList.add("Enes"); //UnsupportedOperationException
        // sinifList.remove("Nurullah"); //UnsupportedOperationException
        arr[1] = "Emre";

        System.out.println("Deðiþim öncesi array : "+Arrays.toString(arr)); // [Ismail, Emre, Fatih]
        System.out.println("Array'i deðiþtirince list :" + sinifList); // [Ismail, Emre, Fatih]

        sinifList.set(0,"Utku");
        System.out.println("List'i deðiþtirince list :" + sinifList); // [Utku, Emre, Fatih]
        System.out.println("List'i deðiþtirince array :" + Arrays.toString(arr)); // [Utku, Emre, Fatih]


//        List<Integer> sayilar = Arrays.asList(new Integer[5]);
//        System.out.println(sayilar);
    }
}
