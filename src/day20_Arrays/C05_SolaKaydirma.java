package src.day20_Arrays;

import java.util.Arrays;

public class C05_SolaKaydirma {
    public static void main(String[] args) {
        //Verilen 3 elemanli bir array’in tum elemanlarini
        // bir soldaki (SOLA KAYDIRMA) konuma tasiyacak bi program yazin.
        // Ornek;
        // array [1, 2, 3] ise
        // output [2, 3, 1] olacak.

        int arr[]={1,2,3,4,5};

        int temp = arr[0]; // İlk index'2'in kaybolmasını önlemek için temp değişkenine atıyoruz

        for (int i = 0; i < arr.length-1 ; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1]=temp; // Array'daki ilk index sona almak için temp değerini Array'a ekliyoruz

        System.out.println(Arrays.toString(arr)); // [2, 3, 4, 5, 1]

        // Yukarıda değiştirilen Arrayi ilk durumuna getirmek için SAĞA kaydırın

        temp = arr[arr.length-1];

        for (int i = arr.length-1; i > 0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]
    }
}