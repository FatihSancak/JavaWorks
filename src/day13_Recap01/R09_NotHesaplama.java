package src.day13_Recap01;

public class R09_NotHesaplama {
    public static void main(String[] args) {
        /*
        Kullanıcıdan alacağınız vize2, vize3 ve final notlarını
        vizeortalaması %30'u final notunun %70 olarak geçme notunu hesaplayınız
         */

        // inputs
        double vize1 = 50 ;
        double vize2 = 70;
        double finali = 80;

        double gecmeNotu = ((vize1+vize2)/2)*0.30 + (finali * 0.70);
        System.out.println("gecmeNotu = " + gecmeNotu);
    }
}
