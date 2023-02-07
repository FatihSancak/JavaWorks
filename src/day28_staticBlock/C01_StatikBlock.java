package src.day28_staticBlock;

public class C01_StatikBlock {
    static int sayi;

    static {
        /*

        static bloack class üyelerinin tamamýndan önce çalýþýr
        (main method'dan da önce çalýþýr)

        NEDEN KULLANILIR
        static block class oluþturulduðunda çalýþýr.
        genellikle class'la ilgili ön ayarlamalar
        veya static variable'lara deðer atamak için kullanýlýr

        ÇALIÞMA SIRASI
        static block'larýn class içinde nerede olduðu önemli deðildir.
        önce static blocklar çalýþýr.

        birden fazla static block varsa yukarýdan aþaðýya doðru çalýþýr.
         */
        System.out.println("Static Block Çaltýþý");
        sayi = 10;
    }

    public static void main(String[] args) {
        System.out.println("Main Method çalýþýr");
        System.out.println(sayi);
    }
    static {
        System.out.println("Main method altýndaki Startic block çalýþtý");
    }
}
