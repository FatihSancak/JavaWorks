package src.day20_Arrays;

public class C01_LocalVariables {
    public static void main(String[] args) {
        int sayi  = 10;
        /*
        System.out.println(sayiMethod);
        sayiMethod, method1()'de oluþturulmuþ local variable'dir.
         */


        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
        // System.out.println(i);
        // i loop da oluþturlmuþ local variable'dýr.sadece loop içinde kullanýlabilir.

        /*
        static int sayiStatic = 20;
        static keyword sadece class level2da kullanýlabilir.
        methodlarýn içerisinde static variable TANIMLANAMAZ.
         */

    }


    public static void method1(){
        // System.out.println(sayi); // sayý main method()'da oluþturulmuþ local bir variable'dýr.
        // ve sadece o main method'da geçerlidir.

        int sayiMethod=20;
    }
}