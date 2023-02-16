package src.day31_timeFormater_varargs;

public class C05_VarargsParemetreIleKullanim {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir(5,true,"Ali","Ay�e","�smail","Ahmet","Babayi�it","Akdo�an");
/*
varargs teorik olarak sonsuz say�da element alabilri
bir method'da parametre olarak varargs varsa
varargs'�n s�n�rlar�n� bilebilmesi i�in
parametrelerin sonuncusu olmal�d�r.

�ncesinde farkl� parametreler olabilir ama
varargs'dan sonra parametre OLAMAZ.

bu kuraldan �t�r� bir method'da sadece 1 adet varargs olabilir.
 */
    }
    public static void enUzunKelimeyiYazdir(int kelimeSayisi,boolean dogruMu, String... kelime){

        String enUzunKelime=kelime[0];

        for (String each: kelime
        ) {
            if(each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        System.out.println("enUzunKelime = " + enUzunKelime);
    }
}
