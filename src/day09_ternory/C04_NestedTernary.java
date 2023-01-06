package src.day09_ternory;

import java.util.Scanner;

public class C04_NestedTernary {
    /*
    Kullanıcdan bir harf isteyin.
    Küçük harfse konsola "Küçük Harf" yazdırın
    Büyük harfse konsola "Büyük harf" yoksa
    "girdiğiniz karakter harf değildir." yazdırın
     */
    public static void main(String[] args) {

        System.out.println("Bir harf girin: ");
        Scanner scan = new Scanner(System.in);
        char harf  = scan.next().charAt(0);

        String sonuc = (harf>='a' && harf<='z')?("Küçük Harf"):
                ((harf>='A' && harf<='Z')? "Büyük Harf":"Geçersiz Karakter");
        System.out.println(sonuc);
    }
}
