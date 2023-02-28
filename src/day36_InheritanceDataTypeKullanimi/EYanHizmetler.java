package src.day36_InheritanceDataTypeKullanimi;

public class EYanHizmetler extends BMuhasebe{
    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;

    protected void maas(){
        System.out.println("Yan hizmetliler  : " + (30*gunlukMesai*saatUcreti) +" maa� al�r");

    }
    protected void issizlikSigorta(){
        System.out.println("Yan hizmetliler 30% indirimli i�sizlik sigorta yapt�rabilir.");
    }

    public static void main(String[] args) {
        /*
        Overrding child class'daki bir method'un
        parent class'daki ayn� isimdeki method'u
        etkisiz hale getirerek
        kendisinin spresifik �zelli�ini ortaya ��karmas�d�r.

        Overriding'i nerede dikkate al�yoruz;
        bir object olu�turuken
        data t�r� ve constractor farkl� ise

        E�er bir object olu�turulurken
        data t�r� ve constractor farkl� ise
        object2in �zelliklerini belirlerken
        �� konuya dikkat etmek gerekir.

        1 - Object constractor'�n oldu�u class'da olu�ur.
        2 - Object'in �zelliklerini aramaya data t�r�n�n oldu�u class'dan ba�lan�r
            bu class'da aranan �zellik bulunamazsa Parent Class'lara bak�l�r
            orada da bulamazsa CTE verir.

        3 - E�er aranana �zellik variable ise buldu�umuz ilk de�eri yazd�r�r
            Aranan �zellik method ise de�eri yazd�rmadan �nce
            OVERRIDE edilmi� mi diye kontrol etmek gerekir.
            E�er override edildiyse en g�ncel de�eri yazd�r�r�z.

         */

        BMuhasebe yh1 = new EYanHizmetler();
        System.out.println("G�nl�k Mesai : " +yh1.gunlukMesai); // BMuhasebe Class'tan al�r
        System.out.println("Saat �creti : "+ yh1.saatUcreti); // BMuhasebe Class'tan al�r
        yh1.maas(); // Override edilmi� EYanHizmetlerden �al���r.
        yh1.ozelSigorta(); // BMuhasebe Class't�ndan al�r
        yh1.sigorta(); // APersonel Class'�ndan al�r
        System.out.println(yh1.isim); // APersonel Class'�ndan al�r
        System.out.println(yh1.soyIsiim); // APersonel Class'�ndan al�r
        System.out.println(yh1.departmant); // APersonel Class'�ndan al�r

        // yh1.issizlikSigortasi
        // aramaya Muhasbeden ba�lad���m�zdan
        // i�sizlik sigortas� bulamad�k sonu� Compile Time Error
    }
}
