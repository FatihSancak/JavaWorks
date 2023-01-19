package src.day18_while_whileDoWhile;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan toplamak uzere pozitif sayilar isteyin,

        islemi bitirmek icin 0’a basmasini soyleyin.

        Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve
        “Negatif sayi giremezsiniz” yazdirip basa donun

        Kullanici 0’a bastiginda;
        toplam kac pozitif sayi girdigini,
        yanlislikla kac negative sayi girdigini ve
        girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin

         */
        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int pozSayiAdedi =0;
        int negSayiAdedi = 0;
        int pozSayilarTop = 0;

        do{
            System.out.println("lütfen toplamak üzere pozitif bir tam sayı giriniz");
            sayi = scan.nextInt();
            if(sayi>0){
                pozSayiAdedi++;
                pozSayilarTop+=sayi;
            }else if(sayi<0){
                negSayiAdedi++;
                System.out.println("Negatif sayi giremezsiniz");
            }
        }while(sayi!=0);

        System.out.println("Girilen " + pozSayiAdedi +" adet s ayının toplamı : "+ pozSayilarTop );
        System.out.println("Toplamda "+ negSayiAdedi+ " adet negeatif sayı girdiniz. ");
    }
}
