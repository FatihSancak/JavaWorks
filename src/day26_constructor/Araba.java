package src.day26_constructor;

public class Araba {
    public String marka = "Merka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    /*
    Herhangi bir constructor oluþturulduðunda
    Java default constructor'ý siler.
    eðer projemizde bir sorun yaþanmasýný istemiyorsak
    mutlaka default constructor oluþturmalýyýz
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
        System.out.println("Bu araç benzinli motora sahiptir");
    }

    public void maxHiz(int hiz) {
        System.out.println("Bu araba maimum " + hiz + " km hýz yapar");
    }
}
