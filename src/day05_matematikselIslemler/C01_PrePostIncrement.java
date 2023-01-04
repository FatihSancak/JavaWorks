package day05_matematikselIslemler;

public class C01_PrePostIncrement {
    public static void main(String[] args) {
        int sayi1 = 10;

        int sayi2 = sayi1 + 1 ; // sayi2 = 11
        sayi2 += 5; // --> 16
        /*
        Pre ve ya Post increment/Decrement
        sadece ++ veya -- işlemi için geçerlidir.
        Bu iki işlem için sayıdan önce veya sonra yazılmasına göre farklı iki işleyiş olu.
         */
        //int sayi3 = sayi2++;
        int sayi3 = sayi2++;
        // Post Increment
        // önce değer ataması yapılacak sonrasında da sayi2'nin değeri 1 artırılacaktır.
        // 1- sayı2 bir artırılacak,
        // 2- sayi2 değeri sayi3' 'e atanacak.
        System.out.println("Post Increment");
        System.out.println("********************");
        System.out.println("Sayi3 = " + sayi3); // 16
        System.out.println("Sayi2 = " + sayi2); // 17

        int sayi4 = ++sayi1;
        // Pre Increment
        // 1- sayı1 bir artırılacak,
        // 2- sayi1 değeri sayi4' 'e atanacak.
        System.out.println("Pre Increment");
        System.out.println("********************");
        System.out.println("Sayi4 = " + sayi4); // 11
        System.out.println("Sayi1 = " + sayi1); // 11
    }
}
