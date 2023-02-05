package src.day26_constructor;

public class Kamyon {
    public String marka = "Merka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Kamyon(String marka, String model, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
        /*
        Bizim temel amac�m�z KamyonRunner'da argument olarak girilen de�erin
        Kamyon Class'�nda instance variable'a atanmas�
        Ancak Scope konusunda ��renildi�i gibi
        Kamyon constructor Scope'unda marka oldu�u i�in
        instance marka'ya gitmiyor.

        marka = markaK
        model = modelK
        yil = yilK gibi

        Yukar�daki kar���kl��� gidermek i�in instance variable'lar�
        belirli bir hale getirmemiz gerekir.
        Java bunun i�in THIS kyword'unu olu�turmu�tur.

        Genel kullan�m a��s�ndan THIS keyword'u kodu herkesin anlamas�n�
        kolayla�t�rd��� i�in tercih edilir.
         */
    }

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon(int yil, int fiyat){
        this.yil=yil;
        this.fiyat=fiyat;
    }

    public Kamyon() {

    }

    @Override
    public String toString() {
        return "Marka : " + marka +
                "\nModel : " + model +
                "\nY�l : " + yil +
                "\nFiyat : " + fiyat;
    }
}
