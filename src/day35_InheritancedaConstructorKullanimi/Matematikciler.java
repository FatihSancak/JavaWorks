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
    this() constructor call içinde bulunulan constructorlarý,
    super() ise parent class'da bulunan constructor'laarý çaðýrýr

    this() veya super() parametre yapýsýna uygun bir constructor bulamazsa ?
    Java CTE verir.

    constructor konusunda gördüðümüz this.
    o class'daki instance variable'larý refere ediyordu.

    inheritance'da da super. vardýr
    super. parent class'daki instance'larý refere eder.
    super.isim = gibi
     */
}
