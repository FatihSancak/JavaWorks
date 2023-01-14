package src.day14_MethodCreation;

public class C04_MethodCreationReturn {
    public static void main(String[] args) {
        // Verilen isim ve soyismi
        // ilk harif büyük gereiye kalanları * ile değiştirip
        // bize bu haliyle döndüren bir method oluşturun.
        // Not: programın ilerleyen kısımlarında isim ve soyisimi bu şekilde kullanmak istiyoruz.

        String isim ="Enes";
        String soyIsim ="Bozkurt";

        String gizliIsim = isimGizle(isim, soyIsim);
        System.out.println(gizliIsim); // E*** B******
        System.out.println(isim+" "+ soyIsim);
    }

    public static String isimGizle(String isim, String soyIsim) {
        isim= isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyIsim = soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w","*");

        return isim + " " +soyIsim;
    }
}
