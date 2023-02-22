package src.day34_Inheritance;

public class Isci extends Personel {
    /*
    Yaþamda Parent çocuk sahibi olmaya karar verebilir.
    Java'da ise child class'lar özelliklerini inherit etmek istedikleri
    class'ý kendilerin parent edinirler.

    Örneðin Ýþçi class'ýný oluþturulduðunda nelere ihtiyacý var diye düþünülse
    Perseonel class'ýndaki tüm variable ve method'lara ihtiyacý olduðunu görürürüz

    Bu durumda yeniden o variable ve method'larý oluþturmak yerine
    Personel Class'ýný kendimize parent ediniriz.

    Bir class'ý parent edinmek için EXTENDS KEYWORD kullanmalýyýz.

    Bir class baþka bir class'ý parent edindiðinde:
    1. Parent class'daki tüm özellikleri (variable + methods) otomatik olarak sahip olur
    2. Parent class'daki özelliklerden bazýlarýný kendine uyalayabilir.
    3. Parent class'da olmayan bazý yeni özellikler (variable + methods) oluþturabilir.

    Not : Child class Parent class'daki özelliklerden hiçbirini reddemez ama deðiþtirebilir.

    */

    int persNo = 1001;

    public static void main(String[] args) {
        Isci isci = new Isci();
        System.out.println("isci.isim = " + isci.isim); // Ýsim Belirtilmedi kendi class'înda isim variable yok, onun için parent'a gider.

        isci.isim = "Yavuz";
        System.out.println(isci.persNo); // 1001 kendis class'ýnda varsa onu kullanýr.

        isci.maas();

    }

    public void maas() {
        System.out.println("Ýþçiler Minumum 15 € saat ücreti alýr.");
    }

    public void ozelSigorta(){
        System.out.println("Ýþçilerden isteyenlere 50% indirimli özel sigorta yaptýrýlýr.");
    }
}