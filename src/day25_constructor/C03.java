package src.day25_constructor;

public class C03 {
    /*
    Proje oluþturuken bazý class'lar Run etmek için deðil
    variable ve method oluþturup bunlarý baþka class'larda
    kullanmak için oluþturulur.

    Default Constructor parametresizdir.
    Göremezsek de ihtiyaç olduðunda çalýþýr.

    Class içerisinde parametreli veya parametresiz herhangi bir
    constructor oluþturursak Java default constructor'ý siler.

    */
    C03(){

    }
    /*
    Yukarýdaki parametresiz bu constructor
    default constructor ile birebir aynýdýr.
    Ama biz oluþturduðumuz için Default Constructor demeyiz.
    Parametresiz constructor ismi verilir.
     */
    String isim = "Etka";
    public void method01(){
        System.out.println("C03 method çalýþtý.");
    }
}