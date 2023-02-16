package src.day31_timeFormater_varargs;

public class C03_VarargsIleToplama {
    public static void main(String[] args) {
        // Verilen kaç int olursa olsun toplayýp sonucu yazýran bir method oluþturun

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int sayi4 = 40;
        int sayi5 = 50;

        toplaYazdir(sayi1, sayi2, sayi3, sayi4, sayi5);
        toplaYazdir(sayi1, sayi2, sayi3, sayi4);
        toplaYazdir(sayi1, sayi2, sayi3);
        toplaYazdir(sayi1, sayi2);
    }

    public static void toplaYazdir(int... sayi){
        /*
        bu gösterim int variable'lardan oluþan bir varargs demektir.
        Varargs array altyapýsýný kullanýr.
         */

        int toplam = 0;

        int sayiAdedi = sayi.length;

        for (int each: sayi
             )  {
            toplam+= each;
        }

        System.out.println("Girilen toplam "+ sayiAdedi +" sayýnýn toplamý : " + toplam);
    }
}
