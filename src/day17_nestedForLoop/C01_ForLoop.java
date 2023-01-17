package src.day17_nestedForLoop;

public class C01_ForLoop {
    /*
    * verilen String'deki kullanılan harfleri
    * tekrarsız olarak yazdırıp
    * kelimede kullanılan farklı harf sayısını veren bir method yazınız.
    */
    public static void main(String[] args) {
        String input ="Java güzeldir";

        tekrarsizYap(input);

    }
    public static void tekrarsizYap(String input) {
        String benzersizInput="";
        String islenecekKelime = input.replaceAll("\\W","");// boşluklar kaldırıldı
        System.out.print(islenecekKelime.substring(0,1)); // sıfırıncı indexdeki harfi al
        benzersizInput += islenecekKelime.substring(0,1); // sıfırıncı indexdeki harfi al

        for (int i = 1; i < islenecekKelime.length(); i++) {

            if(!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(", "+islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }
        }
        System.out.println("");
        System.out.println("input = " + input);
        System.out.println("benzersizInput = " + benzersizInput);
        System.out.println("islenecekKelime = " + islenecekKelime);
    }
}