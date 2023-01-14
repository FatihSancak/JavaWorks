package src.day14_MethodCreation;
import src.day13_MethodCreation.C04_MethodCreation;
import static src.day14_MethodCreation.C01_MethodCreation.terstenYazdir;

public class C02_MethodCreation {
    public static void main(String[] args) {
        /*
        Verilen üç basamaklı sayının
        Rakamları toplamını yazdıran bir method oluşturun
         */
        int input=898;
        rakamlariTopla(input);
        C04_MethodCreation.topla(6,58);
        terstenYazdir("yara");

    }

    public static void rakamlariTopla(int input) {
        int birlerbasamagi=0, rakamlarToplamı=0, girilenSayi=input;

        birlerbasamagi = input%10;
        rakamlarToplamı += birlerbasamagi;
        input/=10;

        birlerbasamagi = input%10;
        rakamlarToplamı += birlerbasamagi;
        input/=10;

        birlerbasamagi = input%10;
        rakamlarToplamı += birlerbasamagi;
        input/=10;

        System.out.println("girdiğiniz "+ girilenSayi+" sayısının rakamlar toplamı = "+ rakamlarToplamı);
    }
}
