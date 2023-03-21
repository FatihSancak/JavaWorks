package src.day34_inheritance;

public class Personel {
    /*
    E�er Parent class olacak �ekilde tasarlad���m�z veya ilerde
    bu class'� Parent yapmak isteyenler variable ve method'lar�n
    access modifier'�n� PROTECTED
     */
    int persNo;
    String isim = "�sim Belirtilmedi";
    String departman = "Departman Belirtilmedi";

    protected void maas() {
        System.out.println("T�m personelin maa�� vard�r.");
    }

    protected void mesai() {
        System.out.println("T�m personel stat�s�ne g�re mesai yapar.");
    }

    protected void fazlaMesaiUcreti() {
        System.out.println("Personel fazla mesaisini stat�s�ne g�re al�r.");
    }
}
