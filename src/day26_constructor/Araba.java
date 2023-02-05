package src.day26_constructor;

public class Araba {
    public String marka = "Merka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    /*
    Herhangi bir constructor olu�turuldu�unda
    Java default constructor'� siler.
    e�er projemizde bir sorun ya�anmas�n� istemiyorsak
    mutlaka default constructor olu�turmal�y�z
     */
    public Araba(String markaR, String modelR, int yilR, int fiyatR) {
        marka = markaR;
        model = modelR;
        yil = yilR;
        fiyat = fiyatR;
    }

    public Araba() {

    }

    public void benziliArac() {
        System.out.println("Bu ara� benzinli motora sahiptir");
    }

    public void maxHiz(int hiz) {
        System.out.println("Bu araba maimum " + hiz + " km h�z yapar");
    }
}
