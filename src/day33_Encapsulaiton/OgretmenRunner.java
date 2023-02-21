package src.day33_Encapsulaiton;

public class OgretmenRunner {
    public static void main(String[] args) {
        /*
        Bu yöntemle data hiding deðil
        daha anlaþýlýr kod amaçlanmýþtýr.
         */
        Ogretmen ogr1 = new Ogretmen();

        ogr1.setIsim("Gürhan");
        System.out.println(ogr1.getIsim().toLowerCase());
    }
}
