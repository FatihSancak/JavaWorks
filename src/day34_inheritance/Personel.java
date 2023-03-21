package src.day34_inheritance;

public class Personel {
    /*
    Eðer Parent class olacak þekilde tasarladýðýmýz veya ilerde
    bu class'ý Parent yapmak isteyenler variable ve method'larýn
    access modifier'ýný PROTECTED
     */
    int persNo;
    String isim = "Ýsim Belirtilmedi";
    String departman = "Departman Belirtilmedi";

    protected void maas() {
        System.out.println("Tüm personelin maaþý vardýr.");
    }

    protected void mesai() {
        System.out.println("Tüm personel statüsüne göre mesai yapar.");
    }

    protected void fazlaMesaiUcreti() {
        System.out.println("Personel fazla mesaisini statüsüne göre alýr.");
    }
}
