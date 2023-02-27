package src.day35_InheritancedaConstructorKullanimi;

public class BParent extends AGrandParent {

    protected String isim = "Parent isim belitrilmedi";
    protected String parentKlupAdi = "Parent  Klubü";

    BParent() {
        System.out.println("Parent Constructor çalýþtý");
    }
}
