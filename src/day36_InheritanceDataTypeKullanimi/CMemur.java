package src.day36_InheritanceDataTypeKullanimi;

public class CMemur extends BMuhasebe {

    protected int saatUcreti = 12;
    protected int gunlukMesai = 9;

    protected void maas(){
        System.out.println("Memurlar  : " + (30*gunlukMesai*saatUcreti) +" maa� al�r");

    }
    protected void ozelSigorta(){
        System.out.println("Memurlar 60% indirimli �zel sigorta yapt�rabilir.");
    }

    public static void main(String[] args) {

        CMemur mmr1 = new CMemur();

        // CMemur Class'�ndan gelen veriler
        System.out.println(mmr1.gunlukMesai); // 9
        System.out.println(mmr1.saatUcreti); // 12
        mmr1.maas(); // Memurlar  : 3240 maa� al�r
        mmr1.ozelSigorta(); //Memurlar 60% indirimli �zel sigorta yapt�rabilir.

        // Perseonel class'�ndan gelen veriler
        mmr1.sigorta();
        System.out.println("mmr1.isim = " + mmr1.isim);
        System.out.println("mmr1.soyIsiim = " + mmr1.soyIsiim);
        System.out.println("mmr1.departmant = " + mmr1.departmant);

        BMuhasebe mhsb1 = new BMuhasebe();
        System.out.println("********* ******** ***********");
        /*
        Her ne kadar memur class�n�n i�inde olsak da
        olu�turulan object Muhasebe class'�ndand�r.
        ��nk� data t�r� ve constructor BMuhasebe'dir.

        String str = "Din�";
        ArrayList<Integer> list = new ArrayList<>();
        Integer sayi = 20;

        BMuhsebe class'� da Object olu�turulabilen bir class't�r.
        Ayn� zamanda data t�r�d�r.
         */
        System.out.println(mhsb1.gunlukMesai); // 8
        System.out.println(mhsb1.saatUcreti); // 10
        mhsb1.maas(); // Muhasebe
        mhsb1.ozelSigorta(); // Muhasebe
        mhsb1.sigorta();
        System.out.println(mhsb1.isim);
        System.out.println(mhsb1.soyIsiim);
        System.out.println(mhsb1.departmant);

    }
}
