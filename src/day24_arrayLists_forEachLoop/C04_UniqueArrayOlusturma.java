package src.day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_UniqueArrayOlusturma {
    public static void main(String[] args) {
        // SORU ***
        // Verilen bir array’daki tekrar elementleri tek bir defa barýndýran
        // yeni bir array olarak döndüren bir method oluþturun

        int[] arr = {2, 3, 5, 6, 3, 5, 4, 1, 9, 6, 3, 5, 5};

        int[] uniqueArray = uniqueArrayOlustur(arr);

        System.out.println(Arrays.toString(uniqueArray));
    }

    // ************************************************************************
    // VERÝLAN ARRAYDA BULUNAN BENZERSÝZ DEÐERLERÝ ARRAY OLARAK DÖNDÜREN METHOD
    // ************************************************************************

    public static int[] uniqueArrayOlustur(int[] arr) {
        // Gönderilen array sýralamasý yapýlýr
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        // geri döndürülecek olan listenin oluþturulmasý
        List<Integer> benzersizList = new ArrayList<>();  // [1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 6, 9]


        // gönderilen array'de bulunan her bir elementin
        // yanýndaki elemente eþit olup olmadýðýný kontrol ederek listeye ekleyen döngü
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] != arr[i + 1]) {
                benzersizList.add(arr[i]);
            }

        }
        // Son elementin de kontrolünü (FOR LOOP dýþýnda) yaparak listeye ekleme
        if (!benzersizList.contains(arr[arr.length - 1])) {
            benzersizList.add(arr[arr.length - 1]);
        }

        // benzersiz list : 1 , 2, 3, 4, 5, 6, 9
        // benzersiz listenin size (boyut, uzunluk) bilgisini kullanarak bir array oluþturma

        int[] tekrarsizArr = new int[benzersizList.size()];

        // benzersiz listedeki tüm elemanlarý yeni array'a atama
        for (int i = 0; i < tekrarsizArr.length; i++) {
            tekrarsizArr[i] = benzersizList.get(i);

        }
        // oluþturduðumuz yeni array'i main method'a döndürme
        return tekrarsizArr;
    }
    // ************************************************************************
}