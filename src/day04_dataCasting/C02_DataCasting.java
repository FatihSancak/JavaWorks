package day04_dataCasting;

public class C02_DataCasting {
    public static void main(String[] args) {

        int sayi1 = 23;

        int sayi2 = 5;

        // Sonucu ikisi de int olduğundan sonucu da int olarak kabul eder.
        // 4,6 değil 4 olarak sonuc verir.
        System.out.println(sayi1/sayi2); // 4,6 --> 4
        System.out.println(25*7/3); // 58,66 --> 58

        // İki variable'nın data türü değişik olduğunda
        // daha kapsamlı olan data türünü ana data turu olarak kabul eder.
        // bu sebeple aşağıdaki işlem sonucu 4 yerine 4,6 olarak elde edilir.
        double sayi3= 5;
        System.out.println(sayi1/sayi3); // 4,6

    }
}
