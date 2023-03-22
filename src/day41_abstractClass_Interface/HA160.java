package src.day41_abstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public class HA160 extends FMercedes {
    /*
    Abstract parent silsilesinden gelen
    ilk concrete class
    parent'i olan tüm class'daki abstract method'larý
    concrete hale dönüþtürmek (override etmek) ZORUNDADIR

    Bu kuralýn istisnasý
    parent class'lardan herhangi birinde
    concrete hale dönüþtürülmüþ, abstract method'lardýr.
     */
    public static void main(String[] args) {
        HA160 arb = new HA160();
        // concrete bir class'dan istediðimiz object'i üretebiliriz.

        FMercedes arb2 = new FMercedes();
        // mercedes'de concrete

        // EToyota arb3 = new EToyota()
        EToyota arb4 = new GCorolla();

        // **********************
        // EToyota arb3 = new EToyota() --> hata verir ve abstract methodlarýný da ister.
        // abstract class'lar constructor barýndýrýr
        // Toyota class'ý abstract class olduðundan object üretilemez
        // **********************

        /*
        List<String> list = new List<String>();
        List<String> list2 = new ArrayList<>();


        abstract bir class'ýn özelliklerini taþýyan bir object oluþturmak
        istedðimizde Data türü istediðimiz abstract class
        constructor ise child olan concrete bir class'dan seçeriz
        */
    }
}

