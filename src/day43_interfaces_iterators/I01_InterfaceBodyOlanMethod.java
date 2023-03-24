package src.day43_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();
    public void yakit();
    public abstract String aku();


    /*

    Normal bir class'da olduðumuzu düþünsek
    iki tane access modifier kullanma ihtimali OLAMAZ

    Aþaðýdaki method'da görüþeleceði üzere interface'de
    istisnai olarak body'si olan method'lar oluþturulabilir.

    Bu özellik Java 8'den sonra kullanýlmaya baþlamýþtýr.

    Bu özellikten önce bir Interface'e yeni bir method
    eklememiz gerektiðinde eskiden beri bu interface'i
    implement eden tüm class'lara gidip yeni eklenen
    method'u override etmeniz gerekirdi.

    Bu özellik sayesinde baþýna default veya static keyword
    ekleyerek interface'de yeni ve body'si olan bir method
    oluþturursak bu method'un child class'lar override edilme
    MECBURUYETÝ OLMAZ  ve eskiden implement etmiþ class'larý
    deðiþtirmemiz gerekmez.

    Bu istisnai bir durumdur ve interface için oluþturulan
    genel kurallarý bozmaz

    Bu method'larýn body'si olsa da bunlara concrete method
    denmez ama override edilme mecburiyeti yoktur.

    Buradki default kelimesi access modifier deðil istisnai durumun
    belirtilmesi içindir.

    O zaman neden 2 keyword (static ve default) tanýmlanmýþtýr?

    Bu iki farklý kelimenin amacý child class'lardan bu method'a
    nasil erisilebilecegini belirlemek icindir

    static keyword kullanilirsa, child class'dan bu method'a erismek icin
    InterfaceAdi.methodAdi yeterli olur

    default keyword kullanilirsa, method'a erismek icin obje olusturulmalidir

     */

    public default void teker(){

        System.out.println("DEFAULT... Tüm arabalarýn tekeri vardýr");

    }
    public static void direksiyon(){
        System.out.println("STATIC... Tüm arabalarýn direksiyonu vardýr.");
    }

}
