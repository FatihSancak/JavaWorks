package day04_dataCasting;

public class C03_AutoWidening {
    public static void main(String[] args) {
        byte sayi1 = 23;
        short sayi2 = 55;

        // byte ve short data türleri int daha düşük olduğundan kabul eder.
        int sayi3= sayi1 + sayi2; // 88

        // byte ve short data türleri double daha düşük olduğundan kabul eder.
        double sayi4 = sayi1 * sayi2; // 1265

        sayi4 = sayi2/sayi1; // 2,391 olması gerekirken 2 verir. çünkü işlem int olarak işlem yapar
        System.out.println(sayi4);

        sayi4 = (double)sayi2/sayi1; // sayılardan birini double yaparak kesin sonuca ulaşılır.
        System.out.println(sayi4);
    }
}
