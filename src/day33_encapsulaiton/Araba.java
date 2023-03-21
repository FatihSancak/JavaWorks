package src.day33_encapsulaiton;

public class Araba {
    String marka = "Marka Belirtilmedi";
    // marka'n�n access modifier'� default access modifier oldu�undan package i�inde kullan�labilir.
    // ekstradan ba��na default yazmaya Java izin vermez ve gerek yoktur.

    private String model = "Model Belirtilmedi";
    private String yakit = "Elektrikli";



    // t�m arabalar elektrikli ise bu variable'2'in de�i�tirilmemesi gerekli.
    // private yap�lan model ve yak�t variable'lar�na eri�imi yetkilendirelim.
    // model de�er atanabilsin ama g�r�nmesin (setter)
    // yak�t ise g�r�lebilsin ama yeni de�er atanamas�n istenirse (getter)
    // bunun i�in


    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }
}
