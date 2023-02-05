package src.day25_constructor;

public class Car {
    /*
    Bu class bizim kalýphanemiz. bir araba oluþturmak için
    ihtiyacýmýz olan variable ve methodlarý bu class'da belirleriz.
    Sonra farklý class'larda araba oluþturmamýz gerekirse bu class'dan
    bir object oluþturup burada belirlenen variable ve method'lara göre araba üretir.
     */
    public String marka = "Merka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public void benziliArac() {
        System.out.println("Bu araç benzinli motora sahiptir");
    }

    public void maxHiz(int hiz) {
        System.out.println("Bu araba maimum " + hiz + " km hýz yapar");
    }
}
