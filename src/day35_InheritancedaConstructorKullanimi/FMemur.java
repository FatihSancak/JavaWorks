package src.day35_InheritancedaConstructorKullanimi;

public class FMemur extends EMuhasebe{
    /*
    extends keyword kullanýlan classlarda
    ister DEFAULT cons. bulunsun
    istersek de biz yeni constructor(lar) oluþturalým

    Java constructor'ýn ilk satýrýna
    super(); constructor call yazar.

    super(); constructor call, default cons. benzer
    görünmese de orada vardýr ve çalýþýr
    ancak biz ilk satýra farklý bir constructor call yazarsak
    Java super(); 'i siler.

    Eðer biz müdahale edip kendi constructor call'ýmýzý oluþturmaksak
    Java'nýn default olarak oluþturduðu constructor call
    her zaman parametresizdir.
    super();

     */

    FMemur(){
        System.out.println("Memur Parametresiz cons.");
    }
    FMemur(String isim){
        System.out.println("Memur Parametreli cons.");
    }

    public static void main(String[] args) {
        FMemur mmr1 = new FMemur("Fatih");
    }
}
