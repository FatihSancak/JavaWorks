package src.day35_inheritancedaConstructorKullanimi;

public class BParent extends AGrandParent {

    protected String isim = "Parent isim belitrilmedi";
    protected String parentKlupAdi = "Parent  Klub�";

    BParent() {
        System.out.println("Parent Constructor �al��t�");
    }
}
