package src.day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_UniqueArrayOlusturma {
    public static void main(String[] args) {
        // SORU ***
        // Verilen bir array�daki tekrar elementleri tek bir defa bar�nd�ran
        // yeni bir array olarak d�nd�ren bir method olu�turun

        int[] arr = {2, 3, 5, 6, 3, 5, 4, 1, 9, 6, 3, 5, 5};

        int[] uniqueArray = uniqueArrayOlustur(arr);

        System.out.println(Arrays.toString(uniqueArray));
    }

    // ************************************************************************
    // VER�LAN ARRAYDA BULUNAN BENZERS�Z DE�ERLER� ARRAY OLARAK D�ND�REN METHOD
    // ************************************************************************

    public static int[] uniqueArrayOlustur(int[] arr) {
        // G�nderilen array s�ralamas� yap�l�r
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        // geri d�nd�r�lecek olan listenin olu�turulmas�
        List<Integer> benzersizList = new ArrayList<>();  // [1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 6, 9]


        // g�nderilen array'de bulunan her bir elementin
        // yan�ndaki elemente e�it olup olmad���n� kontrol ederek listeye ekleyen d�ng�
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] != arr[i + 1]) {
                benzersizList.add(arr[i]);
            }

        }
        // Son elementin de kontrol�n� (FOR LOOP d���nda) yaparak listeye ekleme
        if (!benzersizList.contains(arr[arr.length - 1])) {
            benzersizList.add(arr[arr.length - 1]);
        }

        // benzersiz list : 1 , 2, 3, 4, 5, 6, 9
        // benzersiz listenin size (boyut, uzunluk) bilgisini kullanarak bir array olu�turma

        int[] tekrarsizArr = new int[benzersizList.size()];

        // benzersiz listedeki t�m elemanlar� yeni array'a atama
        for (int i = 0; i < tekrarsizArr.length; i++) {
            tekrarsizArr[i] = benzersizList.get(i);

        }
        // olu�turdu�umuz yeni array'i main method'a d�nd�rme
        return tekrarsizArr;
    }
    // ************************************************************************
}