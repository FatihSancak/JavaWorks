package src.day43_interfaces_iterators;

public class M02_Child implements I01_InterfaceBodyOlanMethod{
    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }
    /*
    Parent interface'de abstract olan 3 method'u implement ettigimizde
    Java itirazini durdurur.

    Sonradan ekledigimiz default veya static keyword ile tanimladigimiz
    method'lari implement etmemiz sorun olusturmadi

    O zaman neden 2 keyword (static ve default) tan�mlanm��t�r?

    Bu iki farkl� kelimenin amac� child class'lardan bu method'a
    nasil erisilebilecegini belirlemek icindir

    static keyword kullanilirsa, child class'dan bu method'a erismek icin
    InterfaceAdi.methodAdi yeterli olur

    default keyword kullanilirsa, method'a erismek icin obje olusturulmalidir
     */

    public static void main(String[] args) {
        I01_InterfaceBodyOlanMethod.direksiyon();

        M02_Child obj = new M02_Child();
        obj.teker();
    }
}
