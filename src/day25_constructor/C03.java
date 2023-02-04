package src.day25_constructor;

public class C03 {
    /*
    Proje olu�turuken baz� class'lar Run etmek i�in de�il
    variable ve method olu�turup bunlar� ba�ka class'larda
    kullanmak i�in olu�turulur.

    Default Constructor parametresizdir.
    G�remezsek de ihtiya� oldu�unda �al���r.

    Class i�erisinde parametreli veya parametresiz herhangi bir
    constructor olu�turursak Java default constructor'� siler.

    */
    C03(){

    }
    /*
    Yukar�daki parametresiz bu constructor
    default constructor ile birebir ayn�d�r.
    Ama biz olu�turdu�umuz i�in Default Constructor demeyiz.
    Parametresiz constructor ismi verilir.
     */
    String isim = "Etka";
    public void method01(){
        System.out.println("C03 method �al��t�.");
    }
}