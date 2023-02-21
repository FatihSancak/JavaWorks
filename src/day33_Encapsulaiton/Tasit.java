package src.day33_Encapsulaiton;

public class Tasit {

    private String tasitTuru;
    private boolean muayenesiVarMi;
    private int yil;

    public String getTasitTuru() {
        return tasitTuru;
    }

    /*
    Getter method'u da tek bir sat�rl�k i�lem yap�yor
    ba�ka class'lar�n private oldu�u i�in eri�emedi�i
    tasitTuru bilgisini, class i�inden al�p istenen farkl�
    class'lara return eder.
     */
    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
    }

    /*
    setTasitTuru() method'un da return olmad��� i�in
    bu method'un �a�r�ld��� TasitRunner class'�nda yazd�r�lamaz.
    1 sat�rl�k i�lem var. G�nderilen argument'i instance'a atama yap�lmaktad�r.
    */

    public boolean isMuayenesiVarMi() {
        return muayenesiVarMi;
    }

    /*
    boolean variable'lar i�in olu�turulan getter method'lar�n�n ismi
    isVariableIsmi �eklinde de olabilir.
     */

    public void setMuayenesiVarMi(Boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
