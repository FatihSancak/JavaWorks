package src.day43_interfaces_iterators;

public class C00_Repeat {
    /*
    INTERFACE

    1.  Interface : Java'da full abstraction saðlayarak child class'larýn
        mutlaka yerine getirmesi gereken özellikleri belirleyen bir yapýdýr.

    2.  Bu haliyele interface, child class'larýn her alanýna mecburen doldurmasý
        gereken bir þablon gibidir.

    3.  Interface'lerde concrete method olmaz

    4.  Interface'lerde tüm variable'lar public, static ve final'dýr. Biz bu
        anahtar kelimeleri kullansak da kullanmasak da Java bu þekilde kabul
        eder.

    5.  Interface'deki tüm methodlar ise public ve abstract'týr. Biz bu
        anahtar kelimeleri kullansak da kullanmasak da Java bu þekilde kabul
        eder.

    6.  Bir concrete class birden fazla class'ý inherit edemez, ancak birden
        fazla interface'i implement edebilir. Bu durumda;
            - eðer birden fazla parent interface'de ayný isimde variable varsa
              interfaceismi.varIsmi
            - eðer birden fazla parent interface'de ayný isimde ve ayný return
              type'da method varsa herhangi bir override ettiði önemsiz olduðundan
              sorun çýkmaz.
            - ancak ayný isim farklý retrun type'i olan methodlar varsa CTE olur.
    7.  Interface'de body'si olan method yazýlabilir. Ancak bu istinai bir durumdur
        ve kurallarý bozmaz.


     */
}

