package src.day31_timeFormater_varargs;

public class C04_VarargsIleEnUzunKelime {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir("Ali","Ay�e","�smail","Ahmet","Babayi�it");

    }
    public static void enUzunKelimeyiYazdir(String... kelime){

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
