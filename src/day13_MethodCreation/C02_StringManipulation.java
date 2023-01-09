package src.day13_MethodCreation;

import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {
    /*
    Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre
    basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir
    sifre girin” yazdirin
    - Ilk harf buyuk harf olmali
    - Son harf kucuk harf olmali
    - Sifre bosluk icermemeli
    - Sifre uzunlugu en az 8 karakter olmal
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir şifre giriniz");

        String sifre = scan.nextLine();
        int kontrol = 0;

        // İlk harf kontrolü
        if(sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            kontrol++;
        }else{
            System.out.println("İlk harf büyük olmalıdır");
        }

        // Son harf kontrolü
        if(sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z' ){
            kontrol++;
        }else{
            System.out.println("Son harfinizin küçük olması gerekmektedir.");
        }
        // Boş karakter  kontrolü
        if(sifre.contains(" ")){
            System.out.println("Şifrenizde boşluk karakteri olmamalıdır");
        }else{
            kontrol++;
        }
        //Şifre uzunluk kontrolü
        if(sifre.length()>=8){
            kontrol++;
        }else {
            System.out.println("Şifreniz en az 8 karakter olmalıdır.");
        }
        if(kontrol==4){
            System.out.println("Şifre başarıyla tanımlandı.");
        }else{
            System.out.println("İşlem başarısız, lütfen tekrar deneyiniz. ");
        }
    }
}
