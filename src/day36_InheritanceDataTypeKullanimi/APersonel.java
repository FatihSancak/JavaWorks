package src.day36_InheritanceDataTypeKullanimi;

public class APersonel {
    String isim = "Ýsim belitilmedi";
    String soyIsiim = "Soyisim belirtilmedi";
    String departmant = "Departman belritilmedi";

    protected void maas(){
        System.out.println("Tüm personelimiz maaþ alýr.");
    }

    protected void sigorta(){
        System.out.println("Tüm personelimiz sigortalýdýr.");
    }

}
