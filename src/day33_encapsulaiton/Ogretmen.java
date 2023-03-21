package src.day33_encapsulaiton;

public class Ogretmen {

    /*
    Bazen de yetkileri s�n�rlamaktan �te
    yap�lan i�i daha iyi tan�mlamak
    i�in encapsulation kullan�l�r.

    Bu yakla��m� kullanan class'larda
    t�m variable'lar private yap�l�p hepsi i�in getter ve setter olu�turulur.
     */

    private String soyisim;
    private String isim;
    private String brans;

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}
