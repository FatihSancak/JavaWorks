package src.day33_encapsulaiton;

public class Ogretmen {

    /*
    Bazen de yetkileri sýnýrlamaktan öte
    yapýlan iþi daha iyi tanýmlamak
    için encapsulation kullanýlýr.

    Bu yaklaþýmý kullanan class'larda
    tüm variable'lar private yapýlýp hepsi için getter ve setter oluþturulur.
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
