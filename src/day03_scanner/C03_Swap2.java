package day03_scanner;

public class C03_Swap2 {
    public static void main(String[] args) {
        /*
        Verilen sayi1 ve sayi2 variable’larinin degerlerini 3.bir variable
        olmadan degistiren (SWAP) bir program yapiniz
         */
        int sayi1 = 20;
        int sayi2 = 10;

        sayi1 = sayi1+sayi2 ; // sayi1 = 10 + 20 = 30
        sayi2 = sayi1-sayi2 ; // sayi2 = 30 - 20 = 10 Birinci değişim yapıldı.
        sayi1 = sayi1-sayi2 ; // sayi1 = 30 - 10 = 20 İkinci değişim de yapıldı.

        System.out.println(sayi1+"\n"+ sayi2);

    }
}
