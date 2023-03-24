package src.day43_interfaces_iterators;

public class C00_Repeat {
    /*
    INTERFACE

    1.  Interface : Java'da full abstraction sa�layarak child class'lar�n
        mutlaka yerine getirmesi gereken �zellikleri belirleyen bir yap�d�r.

    2.  Bu haliyele interface, child class'lar�n her alan�na mecburen doldurmas�
        gereken bir �ablon gibidir.

    3.  Interface'lerde concrete method olmaz

    4.  Interface'lerde t�m variable'lar public, static ve final'd�r. Biz bu
        anahtar kelimeleri kullansak da kullanmasak da Java bu �ekilde kabul
        eder.

    5.  Interface'deki t�m methodlar ise public ve abstract't�r. Biz bu
        anahtar kelimeleri kullansak da kullanmasak da Java bu �ekilde kabul
        eder.

    6.  Bir concrete class birden fazla class'� inherit edemez, ancak birden
        fazla interface'i implement edebilir. Bu durumda;
            - e�er birden fazla parent interface'de ayn� isimde variable varsa
              interfaceismi.varIsmi
            - e�er birden fazla parent interface'de ayn� isimde ve ayn� return
              type'da method varsa herhangi bir override etti�i �nemsiz oldu�undan
              sorun ��kmaz.
            - ancak ayn� isim farkl� retrun type'i olan methodlar varsa CTE olur.
    7.  Interface'de body'si olan method yaz�labilir. Ancak bu istinai bir durumdur
        ve kurallar� bozmaz.


     */
}

