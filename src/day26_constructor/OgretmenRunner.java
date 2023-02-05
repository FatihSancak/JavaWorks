package src.day26_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogretmen1 = new Ogretmen();
        System.out.println("Öðretmen 1 "+ogretmen1);

        Ogretmen ogretmen2 = new Ogretmen("Mustafa","Kemal","01/01/1981","Türkçe","Matematik");
        System.out.println("Öðretmen 2 "+ogretmen2);

        Ogretmen ogretmen3 = new Ogretmen("Kahraman", "Mehmet","18/05/1919");
        System.out.println("Öðretmen 3 "+ogretmen3);
    }
}
