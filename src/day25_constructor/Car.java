package src.day25_constructor;

public class Car {
    /*
    Bu class bizim kal�phanemiz. bir araba olu�turmak i�in
    ihtiyac�m�z olan variable ve methodlar� bu class'da belirleriz.
    Sonra farkl� class'larda araba olu�turmam�z gerekirse bu class'dan
    bir object olu�turup burada belirlenen variable ve method'lara g�re araba �retir.
     */
    String marka = "Merka belirtilmedi";
    String model = "Model belirtilmedi";
    int yil;
    int fiyat;

    public void benziliArac() {
        System.out.println("Bu ara� benzinli motora sahiptir");
    }

    public void maxHiz(int hiz) {
        System.out.println("Bu araba maimum " + hiz + " km h�z yapar");
    }
}
