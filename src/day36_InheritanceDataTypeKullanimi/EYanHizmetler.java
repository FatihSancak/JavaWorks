package src.day36_InheritanceDataTypeKullanimi;

public class EYanHizmetler extends BMuhasebe{
    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;

    protected void maas(){
        System.out.println("Yan hizmetliler  : " + (30*gunlukMesai*saatUcreti) +" maaþ alýr");

    }
    protected void issizlikSigorta(){
        System.out.println("Yan hizmetliler 30% indirimli iþsizlik sigorta yaptýrabilir.");
    }

    public static void main(String[] args) {
        /*
        Overrding child class'daki bir method'un
        parent class'daki ayný isimdeki method'u
        etkisiz hale getirerek
        kendisinin spresifik özelliðini ortaya çýkarmasýdýr.

        Overriding'i nerede dikkate alýyoruz;
        bir object oluþturuken
        data türü ve constractor farklý ise

        Eðer bir object oluþturulurken
        data türü ve constractor farklý ise
        object2in özelliklerini belirlerken
        üç konuya dikkat etmek gerekir.

        1 - Object constractor'ýn olduðu class'da oluþur.
        2 - Object'in özelliklerini aramaya data türünün olduðu class'dan baþlanýr
            bu class'da aranan özellik bulunamazsa Parent Class'lara bakýlýr
            orada da bulamazsa CTE verir.

        3 - Eðer aranana özellik variable ise bulduðumuz ilk deðeri yazdýrýr
            Aranan özellik method ise deðeri yazdýrmadan önce
            OVERRIDE edilmiþ mi diye kontrol etmek gerekir.
            Eðer override edildiyse en güncel deðeri yazdýrýrýz.

         */

        BMuhasebe yh1 = new EYanHizmetler();
        System.out.println("Günlük Mesai : " +yh1.gunlukMesai); // BMuhasebe Class'tan alýr
        System.out.println("Saat Ücreti : "+ yh1.saatUcreti); // BMuhasebe Class'tan alýr
        yh1.maas(); // Override edilmiþ EYanHizmetlerden çalýþýr.
        yh1.ozelSigorta(); // BMuhasebe Class'týndan alýr
        yh1.sigorta(); // APersonel Class'ýndan alýr
        System.out.println(yh1.isim); // APersonel Class'ýndan alýr
        System.out.println(yh1.soyIsiim); // APersonel Class'ýndan alýr
        System.out.println(yh1.departmant); // APersonel Class'ýndan alýr

        // yh1.issizlikSigortasi
        // aramaya Muhasbeden baþladýðýmýzdan
        // iþsizlik sigortasý bulamadýk sonuç Compile Time Error
    }
}
