package src.day35_inheritancedaConstructorKullanimi;

public class AGrandParent {

    protected String isim = "Grandpa ismi belirtilmedi";
    /*
    Her class'da görünmese de bir constructor vardır.
    Bu class'dan object oluşturmak istediğimizide
    default constructor devreye girecektir.

    Default constructor gözlemleyemeyeceğimiz için
    onun yerine kullanılabilecek parametresiz constructor oluşturalım
     */

    protected String grandpaKlupAdi = "Grandpa  Klubü";

    AGrandParent() {
        System.out.println("Grandpa constructor calisti");
    }
}
