package src.day25_constructor;

public class CarRunner {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.fiyat = 150000;
        car1.yil = 2020;
        car1.marka = "Toyota";

        System.out.println("Car1 Bilgileri\nMarka : " + car1.marka +
                "\nModel : " + car1.model +
                "\nYýl : " + car1.yil +
                "\nFiyat : " + car1.fiyat);
        /*
        Car1 Bilgileri
        Marka : Toyota
        Model : Model belirtilmedi
        Yýl : 2020
        Fiyat : 150000
         */

        System.out.println("***************");

        Car car2 = new Car();
        System.out.println("Car2 Bilgileri\nMarka : " + car2.marka +
                "\nModel : " + car2.model +
                "\nYýl : " + car2.yil +
                "\nFiyat : " + car2.fiyat);
        /*
        Herhangi bir object üzerinden bir variable yazdýrmaya
        çalýþtýðýmýzda Java deðeri þý sýralama ile arar;
        1 - O object oluþturulduktan sonra bir deðer atandý mý?
        2 - Object'in oluþturulduðu Class'da Variable'a bir deðer atanmýþ mý bakar.
        3 - O zaman data türüne göre Java default deðeri atar.

        Ekran çýktýsý þu þekilde olur:

        Car2 Bilgileri
        Marka : Merka belirtilmedi
        Model : Model belirtilmedi
        Yýl : 0
        Fiyat : 0
         */
    }
}