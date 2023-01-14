package src.day15_overloading_for_loop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
        /*
        Verilen iki sayıyı çarpıp sonucu donduren bir method oluşturun
         */
        int sayi1 = 10;
        int sayi2 = 5;

        int sonuc = carpGetir(sayi1,sayi2);
        System.out.println("sonuc = " + sonuc);

    }


    public   static int carpGetir(int sayi1, int sayi2) {
        // Çarpma işlemini yaoan method. 
        return sayi1 * sayi2;
    }
}
