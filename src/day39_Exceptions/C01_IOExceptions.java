package src.day39_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("src/day39_Exceptions/Test.txt");

        /*
        Java'da bilgisayarýmýzdaki bir dosyaya eriþmek istiyorsak
        FileInputStream Class'ýndan yardým alýrýz.

        Ayný þekilde Java'dan bilgisayardaki bir dosyaya ekleme veya
        güncelleme yapmak istiyorsak FileOutpuStream Class'ýndan yardým alýrýz.

        Görüldüðü gibi Compile time'da altýný kýrmýzý çizen her durum
        Compile Time Error deðildir. (new FileInputStream için)

        Java'da bazý exception'lar da Compile Time Exception'dir.
        Özellikle dosya okuma ve yazma ile ilgili exception'lar
        COMPILE TIME EXCEPTION'dýr.
        **********
        Compile Time Exception oluþtuðunda Java 2 çözüm önerir:
        1 - Try / Catch ile çevrelemek.
        2 - Method Signature'ýna THROWS keywordü ile beklenen
            exception türünü yazmak.
        **********
        THROWS EXCEPTION, sadece olayýn farkýnda olduðumuzun
        deklarasyonudur. Exception'ýn Handle edilmesinde hiç
        bir rolü yoktur. Yani Try/Catch ile (handle edemediðimiz)
        kontrol altýna aldýðýmýz exceptionlarda kod çalýþmaya
        devam ediyordu. Ancak Throws Exception yazdýðýmýzda Java
        bir exxception ile  karþýlaþýrsa hiç bir þey yapmamýþýz
        gibi hata mesajý yayýnlayýp, çalýþmayý durdurur.
         */

    }
}
