package src.day25_constructor;

public class C01 {
    /*
    java OOP konseot kullandýðý için
    oluþturulan her bir class'ýn ihtiyaç duyduðu object üretebilmesine
    uyguun dizayn edilmiþtir.

    Bunun için Java ihtiyaç halinde kullanýlmasý için
    her class'da default (varsayýlan) bir Constructor koymuþtur

    Bu Default Constructor
    Class'dan Object oluþturduðunda otomatik olarak çalýþýr

    Örneðin bu Class'da Contructor gorunmemesine raðmen
    C02 Class'ýnda içinde olduðumuz C01 Class'ýndan bir object üretebildik.
     */
    int sayi;
    public void deneme(){
        System.out.println("C1 den deneme method calisir");
    }
}