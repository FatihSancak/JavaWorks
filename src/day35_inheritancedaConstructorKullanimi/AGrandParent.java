package src.day35_inheritancedaConstructorKullanimi;

public class AGrandParent {

    protected String isim = "Grandpa ismi belirtilmedi";
    /*
    Her class'da g�r�nmese de bir constructor vard�r.
    Bu class'dan object olu�turmak istedi�imizide
    default constructor devreye girecektir.

    Default constructor g�zlemleyemeyece�imiz i�in
    onun yerine kullan�labilecek parametresiz constructor olu�tural�m
     */

    protected String grandpaKlupAdi = "Grandpa  Klub�";

    AGrandParent() {
        System.out.println("Grandpa constructor calisti");
    }
}
