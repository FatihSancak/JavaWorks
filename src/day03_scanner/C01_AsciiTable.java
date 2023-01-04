package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {

//        bir tam sayı ile bir char değişken oluşturun ve bunların toplmını yazdırın;

        int sayi= 10;
        char harf ='a';
        String str = "banan";

        System.out.println(sayi+harf); // 10a değil 107 olud.
        System.out.println(sayi*harf); // 970
        System.out.println(str+harf); // banana
        System.out.println(harf+2); // 99
        System.out.println(str+sayi); // banan10
/*
    1 - char data türü işleme girdiğinde değişkenin türüne göre farklı davranabilir.
      eğer matematiksel işleme girdiği variable sayısal bir değerse sayı gibi davranır.
      sayi + harf sayi variable'i int olduğundan harf variable'i ascii tablosundan 97 değerini kulllanır.

      char yeniharf = harf + 2 ;java önce sağdaki işlemi yapar, sağda int + char gorunce ascii değerini
      alır ve sonucu 99 olarak bulur. sonra atama işlemi yapmaya çalışır.
      char yeniharf = 99;
      bu atama java acısından kabul edilebilir değildir.

    2 -str+harf string variable çok güçlüdür.
       Hangi data türü ile işleme girerse girsin diğer data türünü kendine benzetir.
 */

//     konsolda 10a görmke istersek nasıl yazdırmalıyız.

        System.out.println(""+sayi+harf); // 10a ("") kullanarak String gibi hareket ettirir.

        char  deger = '1'; // 49

        System.out.println(harf + deger); // '1' + 'a'  --> 49 + 97 = 146
    }
}
