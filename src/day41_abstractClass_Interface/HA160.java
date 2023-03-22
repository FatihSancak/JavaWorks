package src.day41_abstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public class HA160 extends FMercedes {
    /*
    Abstract parent silsilesinden gelen
    ilk concrete class
    parent'i olan t�m class'daki abstract method'lar�
    concrete hale d�n��t�rmek (override etmek) ZORUNDADIR

    Bu kural�n istisnas�
    parent class'lardan herhangi birinde
    concrete hale d�n��t�r�lm��, abstract method'lard�r.
     */
    public static void main(String[] args) {
        HA160 arb = new HA160();
        // concrete bir class'dan istedi�imiz object'i �retebiliriz.

        FMercedes arb2 = new FMercedes();
        // mercedes'de concrete

        // EToyota arb3 = new EToyota()
        EToyota arb4 = new GCorolla();

        // **********************
        // EToyota arb3 = new EToyota() --> hata verir ve abstract methodlar�n� da ister.
        // abstract class'lar constructor bar�nd�r�r
        // Toyota class'� abstract class oldu�undan object �retilemez
        // **********************

        /*
        List<String> list = new List<String>();
        List<String> list2 = new ArrayList<>();


        abstract bir class'�n �zelliklerini ta��yan bir object olu�turmak
        isted�imizde Data t�r� istedi�imiz abstract class
        constructor ise child olan concrete bir class'dan se�eriz
        */
    }
}

