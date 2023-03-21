package src.day36_inheritanceDataTypeKullanimi;

public class DIsci extends BMuhasebe{
    protected int saatUcreti = 11;
    protected int gunlukMesai = 7;

    protected void maasIsci(){
        System.out.println("Ýþçiler  : " + (30*gunlukMesai*saatUcreti) +" maaþ alýr");

    }
    protected void ozelSigortaIsci(){
        System.out.println("Ýþçiler 70% indirimli özel sigorta yaptýrabilir.");
    }

    public static void main(String[] args) {
        BMuhasebe isc1 = new DIsci();
        /*
        bir object oluþturulurken
        Data türü ve constructor ayný class'dan ise
        direk o class'a gidiyorduk


        Þimdi;
        Eðer data türü ve constructor farklý ise
        Object constructor'ýn olduðu class'ýn obeject'idir.
        Ancak, bu durumda bizden istenen
        Isci calss'ýndaki spresifik özellikler deðil,
        bir iþçinin Muhasebe class'ýndaki
        tüm çalýþanlarla beraber sahip olduðu
        genel özellikleri yazdýrýr.
         */

        System.out.println(isc1.gunlukMesai); // M 8
        System.out.println(isc1.saatUcreti); // M 10
        isc1.maas(); // Muhasebe Personel minumum : 2400 maaþ alýr
        isc1.ozelSigorta(); // Muhasebe Ýsteyen çalýþanlara %50 indirimli özel sigorta yapýlýr
        isc1.sigorta(); // P
        System.out.println(isc1.isim); // P
        System.out.println(isc1.soyIsiim); // P
        System.out.println(isc1.departmant); // P

        System.out.println("************************************************");
        /*
        Eðer data türü olan class'da aradýðýmýz yoksa
        varsa onun parent'ýna gidebilir
        ama child'a donüþ olmaz

        Aradýðý özelliði bulamazsa CTE verir.
         */
        APersonel isc2 = new DIsci();
        // System.out.println(isc2.gunlukMesai); // M 8
        // System.out.println(isc2.saatUcreti); // M 10
        isc2.maas(); // Muhasebe Personel minumum : 2400 maaþ alýr
        // isc2.ozelSigorta(); // Muhasebe Ýsteyen çalýþanlara %50 indirimli özel sigorta yapýlýr
        isc2.sigorta(); // P
        System.out.println(isc2.isim); // P
        System.out.println(isc2.soyIsiim); // P
        System.out.println(isc2.departmant); // P

        /*
        Link<String> list1 =  new LinkedList<>();
        Deque<String> list2 = new LinkedList<>();
        Queue<String> list3 = new LinkedList<>();

        Hepsi LinkedList olsa da
        list1 List gibi davranýr
        list2 Deque gibi davranýr
        list3 Queue gibi davranýr
         */
    }
}
