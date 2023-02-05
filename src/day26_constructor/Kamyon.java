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
        Bizim temel amacýmýz KamyonRunner'da argument olarak girilen deðerin
        Kamyon Class'ýnda instance variable'a atanmasý
        Ancak Scope konusunda öðrenildiði gibi
        Kamyon constructor Scope'unda marka olduðu için
        instance marka'ya gitmiyor.

        marka = markaK
        model = modelK
        yil = yilK gibi

        Yukarýdaki karýþýklýðý gidermek için instance variable'larý
        belirli bir hale getirmemiz gerekir.
        Java bunun için THIS kyword'unu oluþturmuþtur.

        Genel kullaným açýsýndan THIS keyword'u kodu herkesin anlamasýný
        kolaylaþtýrdýðý için tercih edilir.
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
                "\nYýl : " + yil +
                "\nFiyat : " + fiyat;
    }
}
