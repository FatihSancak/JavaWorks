package src.day08_ifSatatements;

import java.util.Scanner;

public class C05_NestedIfElseStatement {
    public static void main(String[] args) {
        /*
        Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        Kullanicidan bir sifre girmesini isteyin
        Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise
        “Gecerli Sifre”	degilse “Gecersiz Sifre” yazdirin.
        Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise
        “Gecerli Sifre”	degilse “Gecersiz Sifre” yazdirin.
         */
        System.out.println("Lütfen bir şifre giriniz");
        Scanner scan = new Scanner(System.in);
        String sifre = scan.next();
        char ilkharf = sifre.charAt(0);

        if(ilkharf>='A' && ilkharf<='Z'){ // İlk harfi BÜYÜK olan kelimeler
            if (ilkharf=='A'){
                System.out.println("Geçerli Şifre");
            }else {
                System.out.println("Geçersiz Şifre");
            }
        } else if (ilkharf>='a' && ilkharf<='z'){ //ilk harf küçük harf
            if (ilkharf=='z'){
                System.out.println("Geçerli Şifre");
            }else{
                System.out.println("Geçersiz Şifre");
            }

        }else {
            System.out.println("Lütfen ilk karakter için sadece Harf kullanın");
        }
    }
}
