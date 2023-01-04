package day04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {
        
        char harf = 'a';
        // char yeniHarf = harf + 1;
        // kod bu durumda öncelikle sağdaki işlemi yapar
        // char yeniHarf = 97 + 1 --> 98
        // char bir variable 98 olamayacağı için Java hata verir.
        // bu işlem yapılmak isteniyorsa aşağıdaki gibi işlem sonucuna tanımlama yapılmalıdır.

        char yeniHarf = (char) (harf + 1) ;
        // sonuc ascii karakter sonucundaki karakteri yazdıracaktır. --> b

        System.out.println("Sonuc : "+yeniHarf);

        /*
        BAzen bir variable'a oluşturulduğu data türü dışından değer atanabilir.
        Bunlardan bazılarını Java otomatik olarak kabul eder.
        Örneğin;
         */
        double sayi1 = 10;
        int sayi2 = 'c';
        char harf2 = 98;
        // System.out.println(sayi1 +"..."+ sayi2 +"..."+harf2);  -->  10.0...99...b
        /*
        Java eğer bu değer atamasında sorun oluşacağını
        (data kayolarının olabileceğini veya datanın başkalaşabileceğini) görürse
        bu durumda otomatik olarak o atamayı kabul etmez. sizden eğer bu atmayı istiyorsanız sorumluluğu
        almanızı bekler.
         */
        int sayi3 = (int)7.3; // --> int sayi1 = 7.3;
        System.out.println(sayi3); // --> 7

    }
}
