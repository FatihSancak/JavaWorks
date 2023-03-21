package src.day40_final;

public class A {
    protected String isim = "C�neyt";
    final static String OKUL = "Y�ld�z Koleji";
    /*
    Bir variable FINAL olarak tan�mland�ysa
    ba�ka class'lardan veya i�indeki class'tan
    bu variable'a ba�ka de�er atanmas� m�mk�n de�ildir.

    Madem ki de�eri de�i�tirilemiyor
    genelde static de yaparak
    bu variable'a eri�im kolayla�t�r�l�r.

    Genelde Static Final olarak belirlenen variable
    isimleri B�Y�K HARFLE yaz�l�r.

    Bir method'u final olarak i�aretlerseniz
    bu method de�i�tirilemez demektir.
    (override edilemez)

     */

    final void finalMethod(){
        System.out.println("Final methodlar override edilemez");
    }
}
