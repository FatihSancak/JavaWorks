package src.day28_staticBlock;

public class C01_StatikBlock {
    static int sayi;

    static {
        /*

        static bloack class �yelerinin tamam�ndan �nce �al���r
        (main method'dan da �nce �al���r)

        NEDEN KULLANILIR
        static block class olu�turuldu�unda �al���r.
        genellikle class'la ilgili �n ayarlamalar
        veya static variable'lara de�er atamak i�in kullan�l�r

        �ALI�MA SIRASI
        static block'lar�n class i�inde nerede oldu�u �nemli de�ildir.
        �nce static blocklar �al���r.

        birden fazla static block varsa yukar�dan a�a��ya do�ru �al���r.
         */
        System.out.println("Static Block �alt���");
        sayi = 10;
    }

    public static void main(String[] args) {
        System.out.println("Main Method �al���r");
        System.out.println(sayi);
    }
    static {
        System.out.println("Main method alt�ndaki Startic block �al��t�");
    }
}
