package src.day31_timeFormater_varargs;

public class C03_VarargsIleToplama {
    public static void main(String[] args) {
        // Verilen ka� int olursa olsun toplay�p sonucu yaz�ran bir method olu�turun

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
        bu g�sterim int variable'lardan olu�an bir varargs demektir.
        Varargs array altyap�s�n� kullan�r.
         */

        int toplam = 0;

        int sayiAdedi = sayi.length;

        for (int each: sayi
             )  {
            toplam+= each;
        }

        System.out.println("Girilen toplam "+ sayiAdedi +" say�n�n toplam� : " + toplam);
    }
}
