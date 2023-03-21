package src.day36_inheritanceDataTypeKullanimi;

public class DIsci extends BMuhasebe{
    protected int saatUcreti = 11;
    protected int gunlukMesai = 7;

    protected void maasIsci(){
        System.out.println("���iler  : " + (30*gunlukMesai*saatUcreti) +" maa� al�r");

    }
    protected void ozelSigortaIsci(){
        System.out.println("���iler 70% indirimli �zel sigorta yapt�rabilir.");
    }

    public static void main(String[] args) {
        BMuhasebe isc1 = new DIsci();
        /*
        bir object olu�turulurken
        Data t�r� ve constructor ayn� class'dan ise
        direk o class'a gidiyorduk


        �imdi;
        E�er data t�r� ve constructor farkl� ise
        Object constructor'�n oldu�u class'�n obeject'idir.
        Ancak, bu durumda bizden istenen
        Isci calss'�ndaki spresifik �zellikler de�il,
        bir i��inin Muhasebe class'�ndaki
        t�m �al��anlarla beraber sahip oldu�u
        genel �zellikleri yazd�r�r.
         */

        System.out.println(isc1.gunlukMesai); // M 8
        System.out.println(isc1.saatUcreti); // M 10
        isc1.maas(); // Muhasebe Personel minumum : 2400 maa� al�r
        isc1.ozelSigorta(); // Muhasebe �steyen �al��anlara %50 indirimli �zel sigorta yap�l�r
        isc1.sigorta(); // P
        System.out.println(isc1.isim); // P
        System.out.println(isc1.soyIsiim); // P
        System.out.println(isc1.departmant); // P

        System.out.println("************************************************");
        /*
        E�er data t�r� olan class'da arad���m�z yoksa
        varsa onun parent'�na gidebilir
        ama child'a don�� olmaz

        Arad��� �zelli�i bulamazsa CTE verir.
         */
        APersonel isc2 = new DIsci();
        // System.out.println(isc2.gunlukMesai); // M 8
        // System.out.println(isc2.saatUcreti); // M 10
        isc2.maas(); // Muhasebe Personel minumum : 2400 maa� al�r
        // isc2.ozelSigorta(); // Muhasebe �steyen �al��anlara %50 indirimli �zel sigorta yap�l�r
        isc2.sigorta(); // P
        System.out.println(isc2.isim); // P
        System.out.println(isc2.soyIsiim); // P
        System.out.println(isc2.departmant); // P

        /*
        Link<String> list1 =  new LinkedList<>();
        Deque<String> list2 = new LinkedList<>();
        Queue<String> list3 = new LinkedList<>();

        Hepsi LinkedList olsa da
        list1 List gibi davran�r
        list2 Deque gibi davran�r
        list3 Queue gibi davran�r
         */
    }
}
