package day05_matematikselIslemler;

public class C04_WrapperClass{
    public static void main(String[] args) {
        String str = "Java çok güzel";
        str.toUpperCase();

        int sayi = 10;
        // Primitive data türlerinde yanlarında method'lar olmaz
        // java bazı method'ları kullanabilmemiz için
        // her bir primitive data türü için bir wrapper class oluşturur.
        Integer sayi2 = 10;
        // Java primitive olan data türleri için her biri için Wrapper Class'lar oluşturmuştur.
        sayi2.intValue();
    }
}