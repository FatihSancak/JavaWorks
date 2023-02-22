package src.day34_Inheritance;

public class Isci extends Personel {
    /*
    Ya�amda Parent �ocuk sahibi olmaya karar verebilir.
    Java'da ise child class'lar �zelliklerini inherit etmek istedikleri
    class'� kendilerin parent edinirler.

    �rne�in ���i class'�n� olu�turuldu�unda nelere ihtiyac� var diye d���n�lse
    Perseonel class'�ndaki t�m variable ve method'lara ihtiyac� oldu�unu g�r�r�r�z

    Bu durumda yeniden o variable ve method'lar� olu�turmak yerine
    Personel Class'�n� kendimize parent ediniriz.

    Bir class'� parent edinmek i�in EXTENDS KEYWORD kullanmal�y�z.

    Bir class ba�ka bir class'� parent edindi�inde:
    1. Parent class'daki t�m �zellikleri (variable + methods) otomatik olarak sahip olur
    2. Parent class'daki �zelliklerden baz�lar�n� kendine uyalayabilir.
    3. Parent class'da olmayan baz� yeni �zellikler (variable + methods) olu�turabilir.

    Not : Child class Parent class'daki �zelliklerden hi�birini reddemez ama de�i�tirebilir.

    */

    int persNo = 1001;

    public static void main(String[] args) {
        Isci isci = new Isci();
        System.out.println("isci.isim = " + isci.isim); // �sim Belirtilmedi kendi class'�nda isim variable yok, onun i�in parent'a gider.

        isci.isim = "Yavuz";
        System.out.println(isci.persNo); // 1001 kendis class'�nda varsa onu kullan�r.

        isci.maas();

    }

    public void maas() {
        System.out.println("���iler Minumum 15 � saat �creti al�r.");
    }

    public void ozelSigorta(){
        System.out.println("���ilerden isteyenlere 50% indirimli �zel sigorta yapt�r�l�r.");
    }
}