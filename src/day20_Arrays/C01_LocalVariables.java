package src.day20_Arrays;

public class C01_LocalVariables {
    public static void main(String[] args) {
        int sayi  = 10;
        /*
        System.out.println(sayiMethod);
        sayiMethod, method1()'de olu�turulmu� local variable'dir.
         */


        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
        // System.out.println(i);
        // i loop da olu�turlmu� local variable'd�r.sadece loop i�inde kullan�labilir.

        /*
        static int sayiStatic = 20;
        static keyword sadece class level2da kullan�labilir.
        methodlar�n i�erisinde static variable TANIMLANAMAZ.
         */

    }


    public static void method1(){
        // System.out.println(sayi); // say� main method()'da olu�turulmu� local bir variable'd�r.
        // ve sadece o main method'da ge�erlidir.

        int sayiMethod=20;
    }
}