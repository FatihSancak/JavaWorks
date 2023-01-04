package day04_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1 = 132;

        // sayi1 50 değerini tutuyor ancak sayi2'de bu değeri kabul etmesine rağmen
        // java bunu kabul etmeyecektir. Çünkü Java çalıştırılmadan atanan değerleri görmez.
        byte sayi2 = (byte) sayi1;

        System.out.println(sayi2); //
         /*
         Geniş data türündeki değeri dar data türündeki variable'a atamak isterseniz Java sizin
         geniş data türündeki değeri dar data türünün sınırlarına uyup uymayacağını çalıştırana kadar bilemez.
         Ama Java risk almaz. Riski sıfıra indirmek için burada bir sorun olursa sorumluluğu
         kabul etmenizi ister. Bunun için değerin önüne () içinde istediğiniz data türünü yazmamız yeterli.

         bu riski üstelendiğimizde 3 durum oluşabilir:
         1. Bizim değerimiz dar kalıp değerlerine uygun olursa hiçbir kayıp olmadan cast olur.
         2. double bir sayıyı int'a cast etmek gibi durumlarda data kaybı yaşanabilir.
         3. geniş kalıptan bir değeri dar bir kalıba koyduğunuzda sınırları aşan durumlarda veri başkalaşabilir.
         */

    }
}
