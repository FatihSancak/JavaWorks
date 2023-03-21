package src.day40_final;

public class A {
    protected String isim = "Cüneyt";
    final static String OKUL = "Yýldýz Koleji";
    /*
    Bir variable FINAL olarak tanýmlandýysa
    baþka class'lardan veya içindeki class'tan
    bu variable'a baþka deðer atanmasý mümkün deðildir.

    Madem ki deðeri deðiþtirilemiyor
    genelde static de yaparak
    bu variable'a eriþim kolaylaþtýrýlýr.

    Genelde Static Final olarak belirlenen variable
    isimleri BÜYÜK HARFLE yazýlýr.

    Bir method'u final olarak iþaretlerseniz
    bu method deðiþtirilemez demektir.
    (override edilemez)

     */

    final void finalMethod(){
        System.out.println("Final methodlar override edilemez");
    }
}
