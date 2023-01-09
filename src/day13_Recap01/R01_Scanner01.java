package src.day13_Recap01;

import java.util.Scanner;

public class R01_Scanner01 {
    /*
    kullanıcıdan ad, memleket, şu anki konum, yaş,
    boy soran bir program yazınız.
    ve yaşadıkları yeri seviyorlarsa
    bu bilgiyi yazdırın

    next() only can read the first word
    nextLine() can read the whole line
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("isminiz :");
        String isim = scan.nextLine(); // isim

        System.out.println("memleketiniz :");
        String memleket = scan.nextLine(); // memleket

        System.out.println("konumunuz :");
        String konum = scan.nextLine(); // konum

        System.out.println("yaşınız:");
        int yas = scan.nextInt(); // yas

        System.out.println("boyunuz:");
        double boy = scan.nextDouble(); // boy

        System.out.println("yasdığınız "+ konum.toUpperCase()  +" seviyor musunuz:(true/false) ");
        boolean seviyorMu = scan.nextBoolean(); // boy

        // soutv emmet
        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + konum);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);
    }
}
