package src.day37_overridding;

public class FSupra extends EToyota {

    void yakit() {
        System.out.println("Supra benzin kullanýr");
        /*
        Private Method'lar override edilemez.
        Eðer Child Class'ta Parent Class'daki private method ile
        ayný signature'da bir method oluþturursanýz
        bu overring method OLMAZ
         */
    }

    @Override
    void motor() {
        /*
        @Override notasyonu Java'ya bir görev verir.
        Java bu notasyonla birbirine baðlý olan iki methodu
        sürekli kontrol eder.
        Eðer parent Class'taki
        overriden method'u silerseniz CTE verir.

        @Override kullanmak zorunda degiliz, istersek silebiliriz.
        Ancak kodun anlasilabilir ve okunabilir olmasi icin degil,
        overridden method’da degisiklik yapildiginda
        Java’nin rapor etmesi icin kullanilmasi tercih edilir.

         */
        System.out.println("Sýralý 6 silindir 2JZ motor kullanýr");
    }
}
