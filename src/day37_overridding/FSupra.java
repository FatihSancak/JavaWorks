package src.day37_overridding;

public class FSupra extends EToyota {

    void yakit() {
        System.out.println("Supra benzin kullan�r");
        /*
        Private Method'lar override edilemez.
        E�er Child Class'ta Parent Class'daki private method ile
        ayn� signature'da bir method olu�turursan�z
        bu overring method OLMAZ
         */
    }

    @Override
    void motor() {
        /*
        @Override notasyonu Java'ya bir g�rev verir.
        Java bu notasyonla birbirine ba�l� olan iki methodu
        s�rekli kontrol eder.
        E�er parent Class'taki
        overriden method'u silerseniz CTE verir.

        @Override kullanmak zorunda degiliz, istersek silebiliriz.
        Ancak kodun anlasilabilir ve okunabilir olmasi icin degil,
        overridden method�da degisiklik yapildiginda
        Java�nin rapor etmesi icin kullanilmasi tercih edilir.

         */
        System.out.println("S�ral� 6 silindir 2JZ motor kullan�r");
    }
}
