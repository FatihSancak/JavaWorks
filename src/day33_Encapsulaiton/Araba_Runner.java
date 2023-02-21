package src.day33_Encapsulaiton;

public class Araba_Runner {
    public static void main(String[] args) {
        Araba arb1 = new Araba();
        // arb1 object'i �zerinden marka de�i�kenine ula��ld�, de�i�tirildi (set / yazma) ve yazd�r�ld� (get / okuma)
        arb1.marka = "Toyota";
        System.out.println("arb1.marka = " + arb1.marka);

        // Access Modifieer kullanarak marka variable'ina ula��m�
        // tamamen serbest yapabilir veya tamamen engelleyebiliriz.
        // private yap�lan modele ise hi� ula��lmaz.
        // Access Modifier ya hep ya hi� der.

        // model'i de�i�tirelim ama g�remeyelim
        // yak�t� da g�relim ama de�i�tiremeyelim

        // set ve get yetkilerini �zel olarak tan�mlamak isterseniz,
        // 1. ad�m : �zel yetki tan�mlanacak variable'lar� PRIVATE yapmal�s�n�z
        //           Private bir data'ya ba�ka class'lardan ula�mak m�mk�n olmad���ndan
        // 2. ad�m : Set yetkisi i�in SETTER, Get yetkisi i�in GETTER method'lar� olu�turulmal�d�r.
        //

        arb1.setModel("Corolla");
        // Model olarak Corolla atand�.
        // Model yazd�ralamaz. ��nk� getter() method'u yoktur

        System.out.println(arb1.getYakit());
        // "Eletrikli" bilgisini yazd�r�labilir.
        // Yak�t� de�i�tiremezsiniz setter() method'u yoktur.
    }
}
