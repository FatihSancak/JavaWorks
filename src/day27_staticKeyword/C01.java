package src.day27_staticKeyword;

public class C01 {
    static int sayi = 10;
    int rakam = 5;

    public static void main(String[] args) {
        /*
        Class Level'da iki tür variable oluþturabiliriz.
            Static (Class) variable
            Instance (Object) variable

        Static variable'lar tüm class'dan kullanýlabilirken,
        Intance olanlar sadece static olmayan method'larda kullanýlabilir.
        instance variable'lara static method'dan ulaþmak istersek
        Object oluþturmamýz gereklidir.

        Instance variable'lar Object Variable'lar olduðu için herhangi
        bir satýrda instance variable'ýn deðerinin ne olduðuunu bu
        lmak için
        OBJECT OLUÞTURULAN SATIRDAN itibaren kod incelenmelidir.
        
        Static variable'lar class variable olduðu için
        herhnagi bir satýrda static variable'in deðerini bulmak için
        CLASS'ýn bþýndan itibaren kod incelenmelidir.
         */

        C01 obj1 = new C01();

        System.out.println("obj1 rakam deðeri : " + obj1.rakam);  // 5
        System.out.println("obj1 sayi deðeri : " + sayi); // 10


        // Deðerler 1 artýrýldýktan sonra
        obj1.rakam += 1; // 5 + 1
        sayi += 1; // 10 + 1

        System.out.println();
        System.out.println("Deðeleri 1 artýrdýktan sonra");
        System.out.println("obj1 rakam deðeri : " + obj1.rakam);  // 6
        System.out.println("obj1 sayi deðeri : " + sayi); // 12

        // Yeni bir Object oluþturma
        C01 obj2 = new C01();

        System.out.println("obj2 rakam : " + obj2.rakam); // 5
        System.out.println("obj2 sayi : " + obj2.sayi); // 11

        // Deðerler 1 artýrýldýktan sonra
        obj1.rakam ++; // 5 + 1
        sayi ++; // 11 + 1

        System.out.println("obj2 rakam : " + obj2.rakam); // 6
        System.out.println("obj2 sayi : " + obj2.sayi); // 12


    }
}
