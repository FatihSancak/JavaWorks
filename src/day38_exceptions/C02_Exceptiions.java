package src.day38_exceptions;

public class C02_Exceptiions {
    public static void main(String[] args) {
        int a = 1000;
        int b = 50;
        int sayac = 1;

        while (sayac < 1000) {
/*
* Try/Catch bloðu yapmaya çalýþýtýðýmýz ama risk olduðunu düþündüðümüz
*   iþlemleri yazmak için kullanýlýr.
* Catch'den sonraki parantez karþýlaþmayý beklediðimiz exception
*   türünü Java'ya söylemek için kullanýlýr.
* Catch Bloðu: Java'ya söylediðimiz exception (istisnai durum) gerçekleþirse
*   Java'nýn yapmasýný istediðimiz iþlemi barýndýrýr.
* Catch Bloðunun önündeki paranteze karþýlaþmayý beklediðimiz
*   Exception'ý yazabilir ya da her türlü exception'da devreye girmesini istiyorsak
*   tüm exception'larýn parent'i olan Exception yazabiliriz.
*
* */
            try {
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("Payda 0 oldu. Dikkatli olun.");
            }
            b--;
            sayac++;
        }
    }
}
