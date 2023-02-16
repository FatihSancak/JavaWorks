package src.day31_timeFormater_varargs;

public class C05_VarargsParemetreIleKullanim {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir(5,true,"Ali","Ayþe","Ýsmail","Ahmet","Babayiðit","Akdoðan");
/*
varargs teorik olarak sonsuz sayýda element alabilri
bir method'da parametre olarak varargs varsa
varargs'ýn sýnýrlarýný bilebilmesi için
parametrelerin sonuncusu olmalýdýr.

Öncesinde farklý parametreler olabilir ama
varargs'dan sonra parametre OLAMAZ.

bu kuraldan ötürü bir method'da sadece 1 adet varargs olabilir.
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
