package src.day18_while_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        /*
        While Loop'da önce kontrol edipi sonra işlem yaptığımız için
        işlem bittikten sonra loop'un kırılması için bir kez daha başa dönmemiz gerekiyor
        bu durumda fazladan bir işlem yapılıyor

         */
        int sayi = 7;

        while (sayi<10){
            System.out.println(sayi);
            sayi++;
        }

        System.out.println();
        /*
        Do Whlie Loop ile çalıştığımızda bu dezavantaj ortadan kalkar.
         */
        sayi=7;

        do{
            System.out.println(sayi);
            sayi++;
        } while (sayi<10);

    }
}
