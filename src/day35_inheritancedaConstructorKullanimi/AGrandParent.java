package src.day35_inheritancedaConstructorKullanimi;

public class AGrandParent {

    protected String isim = "Grandpa ismi belirtilmedi";
    /*
    Her class'da görünmese de bir constructor vardýr.
    Bu class'dan object oluþturmak istediðimizide
    default constructor devreye girecektir.

    Default constructor gözlemleyemeyeceðimiz için
    onun yerine kullanýlabilecek parametresiz constructor oluþturalým
     */

    protected String grandpaKlupAdi = "Grandpa  Klubü";

    AGrandParent() {
        System.out.println("Grandpa constructor calisti");
    }
}
