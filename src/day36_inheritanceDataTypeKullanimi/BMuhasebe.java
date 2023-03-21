package src.day36_inheritanceDataTypeKullanimi;

public class BMuhasebe extends APersonel{
    protected int saatUcreti = 10;
    protected int gunlukMesai = 8;

    protected void maas(){
        System.out.println("Personel minumum : " + (30*gunlukMesai*saatUcreti) +" maaþ alýr");
    }

    protected void ozelSigorta(){
        System.out.println("Ýsteyen çalýþanlara %50 indirimli özel sigorta yapýlýr");
    }
}

