package src.day24_arrayLists_forEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {
        String[] arr={"Ismail","Nurullah","Fatih"};
        /*
        *  Uzun listeler olu�turmam�z gerekti�inde
        * tek tek eklemek yerine array olu�turup, bunlar� list'e �evirmek
        * daha pratik olabilir:
        * 1- Loop ile array'deki t�m elementleri List'e atayabiliriz.
        * 2- Arrays.asList() kullanabiliriz
        *    Ancak bu method'un 2 tane kot� yan etkisi vard�r.
        *    - Array Class'� kullan�ld��� i�in array �zellikleri ge�erli olur
        *      dolay�s�yla list'te olan addd, remove gibi size'i de�i�tiren method'lar
        *      bu �ekilde olu�turulan list'lerde kullan�lamaz.
        *    - kaynak olan array ile �r�n olan List �zde�le�tirilir.
        *      birinde yap�lan de�i�iklik, otomatik olarak di�erine de i�lenir
         */

        List<String> sinifList = Arrays.asList(arr);

        System.out.println(sinifList); // [Ismail, Nurullah, Fatih]

        // 1. yan etki
        // sinifList.add("Enes"); //UnsupportedOperationException
        // sinifList.remove("Nurullah"); //UnsupportedOperationException
        arr[1] = "Emre";

        System.out.println("De�i�im �ncesi array : "+Arrays.toString(arr)); // [Ismail, Emre, Fatih]
        System.out.println("Array'i de�i�tirince list :" + sinifList); // [Ismail, Emre, Fatih]

        sinifList.set(0,"Utku");
        System.out.println("List'i de�i�tirince list :" + sinifList); // [Utku, Emre, Fatih]
        System.out.println("List'i de�i�tirince array :" + Arrays.toString(arr)); // [Utku, Emre, Fatih]


//        List<Integer> sayilar = Arrays.asList(new Integer[5]);
//        System.out.println(sayilar);
    }
}
