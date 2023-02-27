package src.day35_InheritancedaConstructorKullanimi;

public class FMemur extends EMuhasebe{
    /*
    extends keyword kullan�lan classlarda
    ister DEFAULT cons. bulunsun
    istersek de biz yeni constructor(lar) olu�tural�m

    Java constructor'�n ilk sat�r�na
    super(); constructor call yazar.

    super(); constructor call, default cons. benzer
    g�r�nmese de orada vard�r ve �al���r
    ancak biz ilk sat�ra farkl� bir constructor call yazarsak
    Java super(); 'i siler.

    E�er biz m�dahale edip kendi constructor call'�m�z� olu�turmaksak
    Java'n�n default olarak olu�turdu�u constructor call
    her zaman parametresizdir.
    super();

     */

    FMemur(){
        System.out.println("Memur Parametresiz cons.");
    }
    FMemur(String isim){
        System.out.println("Memur Parametreli cons.");
    }

    public static void main(String[] args) {
        FMemur mmr1 = new FMemur("Fatih");
    }
}
