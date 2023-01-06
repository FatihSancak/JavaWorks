package src.JetBrains;

import java.util.Scanner;

public class DivideToN {
    public static void main(String[] args) {
        /* ZOR DERECELİ SORU
        Üç pozitif tam sayı a, b, n'yi okuyan ve
        a'dan b'ye (a < b) dahil olmak üzere n'ye bölünebilen sayıların sayısını veren bir program yazın.
        Not: Bu programı herhangi bir döngü olmadan daha verimli yazmak mümkündür.
         */

        System.out.println("Lütfen aralarında boşluk bulunan üç sayı giriniz : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int n = scan.nextInt();
        int tpl =0;
        int c = b-a;


        for(int i = 0;i <= c;i++){
            if(a % n == 0){
                tpl++;
            }
            a++;
        } 
        System.out.println(tpl);
        /*
        İPUÇLARI:
        *********************
        1
        Bu, "başlangıç" ve "bitiş" arasındaki kaç int'nin "bölen" ile
        bölünebileceğini bulmanız gerektiği anlamına gelir,
        yani kalan 0'dır.
        *********************

         */
    }
}
