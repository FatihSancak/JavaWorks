package src.day36_InheritanceDataTypeKullanimi;

public class APersonel {
    String isim = "�sim belitilmedi";
    String soyIsiim = "Soyisim belirtilmedi";
    String departmant = "Departman belritilmedi";

    protected void maas(){
        System.out.println("T�m personelimiz maa� al�r.");
    }

    protected void sigorta(){
        System.out.println("T�m personelimiz sigortal�d�r.");
    }

}
