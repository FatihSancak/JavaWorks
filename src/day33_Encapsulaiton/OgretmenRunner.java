package src.day33_Encapsulaiton;

public class OgretmenRunner {
    public static void main(String[] args) {
        /*
        Bu y�ntemle data hiding de�il
        daha anla��l�r kod ama�lanm��t�r.
         */
        Ogretmen ogr1 = new Ogretmen();

        ogr1.setIsim("G�rhan");
        System.out.println(ogr1.getIsim().toLowerCase());
    }
}
