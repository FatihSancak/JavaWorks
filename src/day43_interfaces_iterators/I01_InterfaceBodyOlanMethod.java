package src.day43_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();
    public void yakit();
    public abstract String aku();


    /*

    Normal bir class'da oldu�umuzu d���nsek
    iki tane access modifier kullanma ihtimali OLAMAZ

    A�a��daki method'da g�r��elece�i �zere interface'de
    istisnai olarak body'si olan method'lar olu�turulabilir.

    Bu �zellik Java 8'den sonra kullan�lmaya ba�lam��t�r.

    Bu �zellikten �nce bir Interface'e yeni bir method
    eklememiz gerekti�inde eskiden beri bu interface'i
    implement eden t�m class'lara gidip yeni eklenen
    method'u override etmeniz gerekirdi.

    Bu �zellik sayesinde ba��na default veya static keyword
    ekleyerek interface'de yeni ve body'si olan bir method
    olu�turursak bu method'un child class'lar override edilme
    MECBURUYET� OLMAZ  ve eskiden implement etmi� class'lar�
    de�i�tirmemiz gerekmez.

    Bu istisnai bir durumdur ve interface i�in olu�turulan
    genel kurallar� bozmaz

    Bu method'lar�n body'si olsa da bunlara concrete method
    denmez ama override edilme mecburiyeti yoktur.

    Buradki default kelimesi access modifier de�il istisnai durumun
    belirtilmesi i�indir.

    O zaman neden 2 keyword (static ve default) tan�mlanm��t�r?

    Bu iki farkl� kelimenin amac� child class'lardan bu method'a
    nasil erisilebilecegini belirlemek icindir

    static keyword kullanilirsa, child class'dan bu method'a erismek icin
    InterfaceAdi.methodAdi yeterli olur

    default keyword kullanilirsa, method'a erismek icin obje olusturulmalidir

     */

    public default void teker(){

        System.out.println("DEFAULT... T�m arabalar�n tekeri vard�r");

    }
    public static void direksiyon(){
        System.out.println("STATIC... T�m arabalar�n direksiyonu vard�r.");
    }

}
