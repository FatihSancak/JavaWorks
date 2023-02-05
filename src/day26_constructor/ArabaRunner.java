package src.day26_constructor;

public class ArabaRunner {
    public static void main(String[] args) {

        // bir g�n �nceki Car class'�ndan object olu�turma
        /*
        Farkl� bir package'dan object olu�turdu�umuzda
        access modifier'lar� da daikkate almal�y�z

        Araba class'�ndan bir object olu�turdu�umda
        e�er Default Constructor kullan�ld�ysa
        t�m �zellikler i�in tek tek de�er atama zorunda kal�r�z

        E�er bir object'i olu�turuken baz� �zelliklerini
        argument olarak belirtip o �zelliklerde bir object
        olu�turmak istersek Java itiraz eder.
        ��nk� her class'da default constructor vard�r.
        ama o da parametresizdir. Bizim yeni ve parametreli
        constructor'lara ihtiyac�m�z var.

         */
        Araba araba1 = new Araba();
        araba1.fiyat =10000;
        araba1.marka="Mercedes";
        araba1.yil= 2010;
        araba1.model ="C180";
        System.out.println("Araba1 Bilgileri\nMarka : " + araba1.marka +
                "\nModel : " + araba1.model +
                "\nY�l : " + araba1.yil +
                "\nFiyat : " + araba1.fiyat);

        Araba araba2 = new Araba("BMW","5.20",2011,15000);
        System.out.println("Araba2 Bilgileri\nMarka : " + araba2.marka +
                "\nModel : " + araba2.model +
                "\nY�l : " + araba2.yil +
               "\nFiyat : " + araba2.fiyat);

        Araba araba3 = new Araba("Opel", "Astra", 2015, 78000);
        System.out.println("Araba3 Bilgileri\nMarka : " + araba3.marka +
                "\nModel : " + araba3.model +
                "\nY�l : " + araba3.yil +
                "\nFiyat : " + araba3.fiyat);

        Araba araba4 = new Araba("Audi", "A5", 2020, 50000);
        System.out.println("Araba4 Bilgileri\nMarka : " + araba4.marka +
                "\nModel : " + araba4.model +
                "\nY�l : " + araba4.yil +
                "\nFiyat : " + araba4.fiyat);

    }
}
