package src.day36_inheritanceDataTypeKullanimi;

public class BMuhasebe extends APersonel{
    protected int saatUcreti = 10;
    protected int gunlukMesai = 8;

    protected void maas(){
        System.out.println("Personel minumum : " + (30*gunlukMesai*saatUcreti) +" maa� al�r");
    }

    protected void ozelSigorta(){
        System.out.println("�steyen �al��anlara %50 indirimli �zel sigorta yap�l�r");
    }
}

