package src.day33_encapsulaiton;

public class Araba {
    String marka = "Marka Belirtilmedi";
    // marka'nýn access modifier'ý default access modifier olduðundan package içinde kullanýlabilir.
    // ekstradan baþýna default yazmaya Java izin vermez ve gerek yoktur.

    private String model = "Model Belirtilmedi";
    private String yakit = "Elektrikli";



    // tüm arabalar elektrikli ise bu variable'2'in deðiþtirilmemesi gerekli.
    // private yapýlan model ve yakýt variable'larýna eriþimi yetkilendirelim.
    // model deðer atanabilsin ama görünmesin (setter)
    // yakýt ise görülebilsin ama yeni deðer atanamasýn istenirse (getter)
    // bunun için


    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }
}
