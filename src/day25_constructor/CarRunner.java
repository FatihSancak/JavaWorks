package src.day25_constructor;

public class CarRunner {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.fiyat = 150000;
        car1.yil = 2020;
        car1.marka = "Toyota";

        System.out.println("Car1 Bilgileri\nMarka : " + car1.marka +
                "\nModel : " + car1.model +
                "\nY�l : " + car1.yil +
                "\nFiyat : " + car1.fiyat);
        /*
        Car1 Bilgileri
        Marka : Toyota
        Model : Model belirtilmedi
        Y�l : 2020
        Fiyat : 150000
         */

        System.out.println("***************");

        Car car2 = new Car();
        System.out.println("Car2 Bilgileri\nMarka : " + car2.marka +
                "\nModel : " + car2.model +
                "\nY�l : " + car2.yil +
                "\nFiyat : " + car2.fiyat);
        /*
        Herhangi bir object �zerinden bir variable yazd�rmaya
        �al��t���m�zda Java de�eri �� s�ralama ile arar;
        1 - O object olu�turulduktan sonra bir de�er atand� m�?
        2 - Object'in olu�turuldu�u Class'da Variable'a bir de�er atanm�� m� bakar.
        3 - O zaman data t�r�ne g�re Java default de�eri atar.

        Ekran ��kt�s� �u �ekilde olur:

        Car2 Bilgileri
        Marka : Merka belirtilmedi
        Model : Model belirtilmedi
        Y�l : 0
        Fiyat : 0
         */
    }
}