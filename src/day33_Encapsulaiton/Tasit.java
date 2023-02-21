package src.day33_Encapsulaiton;

public class Tasit {

    private String tasitTuru;
    private boolean muayenesiVarMi;
    private int yil;

    public String getTasitTuru() {
        return tasitTuru;
    }

    /*
    Getter method'u da tek bir satýrlýk iþlem yapýyor
    baþka class'larýn private olduðu için eriþemediði
    tasitTuru bilgisini, class içinden alýp istenen farklý
    class'lara return eder.
     */
    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
    }

    /*
    setTasitTuru() method'un da return olmadýðý için
    bu method'un çaðrýldýðý TasitRunner class'ýnda yazdýrýlamaz.
    1 satýrlýk iþlem var. Gönderilen argument'i instance'a atama yapýlmaktadýr.
    */

    public boolean isMuayenesiVarMi() {
        return muayenesiVarMi;
    }

    /*
    boolean variable'lar için oluþturulan getter method'larýnýn ismi
    isVariableIsmi þeklinde de olabilir.
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
