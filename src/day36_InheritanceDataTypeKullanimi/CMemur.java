package src.day36_InheritanceDataTypeKullanimi;

public class CMemur extends BMuhasebe {

    protected int saatUcreti = 12;
    protected int gunlukMesai = 9;

    protected void maas(){
        System.out.println("Memurlar  : " + (30*gunlukMesai*saatUcreti) +" maaþ alýr");

    }
    protected void ozelSigorta(){
        System.out.println("Memurlar 60% indirimli özel sigorta yaptýrabilir.");
    }

    public static void main(String[] args) {

        CMemur mmr1 = new CMemur();

        // CMemur Class'ýndan gelen veriler
        System.out.println(mmr1.gunlukMesai); // 9
        System.out.println(mmr1.saatUcreti); // 12
        mmr1.maas(); // Memurlar  : 3240 maaþ alýr
        mmr1.ozelSigorta(); //Memurlar 60% indirimli özel sigorta yaptýrabilir.

        // Perseonel class'ýndan gelen veriler
        mmr1.sigorta();
        System.out.println("mmr1.isim = " + mmr1.isim);
        System.out.println("mmr1.soyIsiim = " + mmr1.soyIsiim);
        System.out.println("mmr1.departmant = " + mmr1.departmant);

        BMuhasebe mhsb1 = new BMuhasebe();
        System.out.println("********* ******** ***********");
        /*
        Her ne kadar memur classýnýn içinde olsak da
        oluþturulan object Muhasebe class'ýndandýr.
        Çünkü data türü ve constructor BMuhasebe'dir.

        String str = "Dinç";
        ArrayList<Integer> list = new ArrayList<>();
        Integer sayi = 20;

        BMuhsebe class'ý da Object oluþturulabilen bir class'týr.
        Ayný zamanda data türüdür.
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
