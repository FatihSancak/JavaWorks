package src.day27_staticKeyword;

public class C01 {
    static int sayi = 10;
    int rakam = 5;

    public static void main(String[] args) {
        /*
        Class Level'da iki t�r variable olu�turabiliriz.
            Static (Class) variable
            Instance (Object) variable

        Static variable'lar t�m class'dan kullan�labilirken,
        Intance olanlar sadece static olmayan method'larda kullan�labilir.
        instance variable'lara static method'dan ula�mak istersek
        Object olu�turmam�z gereklidir.

        Instance variable'lar Object Variable'lar oldu�u i�in herhangi
        bir sat�rda instance variable'�n de�erinin ne oldu�uunu bu
        lmak i�in
        OBJECT OLU�TURULAN SATIRDAN itibaren kod incelenmelidir.
        
        Static variable'lar class variable oldu�u i�in
        herhnagi bir sat�rda static variable'in de�erini bulmak i�in
        CLASS'�n b��ndan itibaren kod incelenmelidir.
         */

        C01 obj1 = new C01();

        System.out.println("obj1 rakam de�eri : " + obj1.rakam);  // 5
        System.out.println("obj1 sayi de�eri : " + sayi); // 10


        // De�erler 1 art�r�ld�ktan sonra
        obj1.rakam += 1; // 5 + 1
        sayi += 1; // 10 + 1

        System.out.println();
        System.out.println("De�eleri 1 art�rd�ktan sonra");
        System.out.println("obj1 rakam de�eri : " + obj1.rakam);  // 6
        System.out.println("obj1 sayi de�eri : " + sayi); // 12

        // Yeni bir Object olu�turma
        C01 obj2 = new C01();

        System.out.println("obj2 rakam : " + obj2.rakam); // 5
        System.out.println("obj2 sayi : " + obj2.sayi); // 11

        // De�erler 1 art�r�ld�ktan sonra
        obj1.rakam ++; // 5 + 1
        sayi ++; // 11 + 1

        System.out.println("obj2 rakam : " + obj2.rakam); // 6
        System.out.println("obj2 sayi : " + obj2.sayi); // 12


    }
}
