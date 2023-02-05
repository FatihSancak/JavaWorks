package src.day26_constructor;

public class ArabaRunner {
    public static void main(String[] args) {

        // bir gün önceki Car class'ýndan object oluþturma
        /*
        Farklý bir package'dan object oluþturduðumuzda
        access modifier'larý da daikkate almalýyýz

        Araba class'ýndan bir object oluþturduðumda
        eðer Default Constructor kullanýldýysa
        tüm özellikler için tek tek deðer atama zorunda kalýrýz

        Eðer bir object'i oluþturuken bazý özelliklerini
        argument olarak belirtip o özelliklerde bir object
        oluþturmak istersek Java itiraz eder.
        Çünkü her class'da default constructor vardýr.
        ama o da parametresizdir. Bizim yeni ve parametreli
        constructor'lara ihtiyacýmýz var.

         */
        Araba araba1 = new Araba();
        araba1.fiyat =10000;
        araba1.marka="Mercedes";
        araba1.yil= 2010;
        araba1.model ="C180";
        System.out.println("Araba1 Bilgileri\nMarka : " + araba1.marka +
                "\nModel : " + araba1.model +
                "\nYýl : " + araba1.yil +
                "\nFiyat : " + araba1.fiyat);

        Araba araba2 = new Araba("BMW","5.20",2011,15000);
        System.out.println("Araba2 Bilgileri\nMarka : " + araba2.marka +
                "\nModel : " + araba2.model +
                "\nYýl : " + araba2.yil +
               "\nFiyat : " + araba2.fiyat);

        Araba araba3 = new Araba("Opel", "Astra", 2015, 78000);
        System.out.println("Araba3 Bilgileri\nMarka : " + araba3.marka +
                "\nModel : " + araba3.model +
                "\nYýl : " + araba3.yil +
                "\nFiyat : " + araba3.fiyat);

        Araba araba4 = new Araba("Audi", "A5", 2020, 50000);
        System.out.println("Araba4 Bilgileri\nMarka : " + araba4.marka +
                "\nModel : " + araba4.model +
                "\nYýl : " + araba4.yil +
                "\nFiyat : " + araba4.fiyat);

    }
}
