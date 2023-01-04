package src.day07_ifStatements;
import java.util.Scanner;
public class C06_ifElseStatements {
    public static void main(String[] args) {
        /*
        Kullaniciya yasini sorun,
        eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”,
        65’e esit veya buyukse “Emekli olabilirsin”
        yazdirin
         */
        System.out.println("Lütfen yaşınızı giriniz");
        Scanner scan = new Scanner(System.in);
        int yas = scan.nextInt();

        if (yas<65){
            System.out.println("Emekli Olamazsınız. "+ (65-yas) +" yıl daha çalışmalısınız");

        }else{
            System.out.println("Emekli Olabilirsiniz");
        }

    }
}
