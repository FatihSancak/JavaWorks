package src.day35_InheritancedaConstructorKullanimi;

public class Matematikciler extends LOgretmen
{
    Matematikciler(){
        System.out.println("Matematikciler parametresiz cons.");
    }
    Matematikciler(String isim){
        this();
        System.out.println("Matematikciler parametreli cons.");
    }

    public static void main(String[] args) {
        Matematikciler obj1 = new Matematikciler("Belinay");
    }
    /*
    this() constructor call i�inde bulunulan constructorlar�,
    super() ise parent class'da bulunan constructor'laar� �a��r�r

    this() veya super() parametre yap�s�na uygun bir constructor bulamazsa ?
    Java CTE verir.

    constructor konusunda g�rd���m�z this.
    o class'daki instance variable'lar� refere ediyordu.

    inheritance'da da super. vard�r
    super. parent class'daki instance'lar� refere eder.
    super.isim = gibi
     */
}
