package src.day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArrayOlustur {
    public static void main(String[] args) {
        // Kullanıcıdan bir sayı array’ın boyutunu ve
        // tüm elementlerini alarak bir array oluşturup,
        // bu array’ı bize donduren bir method oluşturun.

        int[] sayilar = arrayOlustur();

        System.out.println(Arrays.toString(sayilar));

    }

    public static int[] arrayOlustur() {
        // Array'ın uzunluğu alındı
        Scanner scan= new Scanner(System.in);
        System.out.println("Kaç elemanlı bir aray oluşturmamı istersiniz : ");
        int uzunluk = scan.nextInt();

        // Array oluşturuldu
        int[] olusturulan= new int[uzunluk];

        // oluşturulan Array'ın içeriğine değerlerin alınarak
        // Array ile döngü oluşturulark
        // array'ın ilgili indexlerine atama yapıldı.
        for (int i = 0; i < uzunluk; i++) {
            System.out.println(i + " nci index için sayı giriniz");
            olusturulan[i] = scan.nextInt();
        }
        // method da oluşturulan değeri geri döndürüldü.
        return olusturulan;
    }
}