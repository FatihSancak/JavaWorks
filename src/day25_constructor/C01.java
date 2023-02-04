package src.day25_constructor;

public class C01 {
    /*
    java OOP konseot kulland��� i�in
    olu�turulan her bir class'�n ihtiya� duydu�u object �retebilmesine
    uyguun dizayn edilmi�tir.

    Bunun i�in Java ihtiya� halinde kullan�lmas� i�in
    her class'da default (varsay�lan) bir Constructor koymu�tur

    Bu Default Constructor
    Class'dan Object olu�turdu�unda otomatik olarak �al���r

    �rne�in bu Class'da Contructor gorunmemesine ra�men
    C02 Class'�nda i�inde oldu�umuz C01 Class'�ndan bir object �retebildik.
     */
    int sayi;
    public void deneme(){
        System.out.println("C1 den deneme method calisir");
    }
}