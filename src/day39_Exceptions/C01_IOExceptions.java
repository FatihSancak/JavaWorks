package src.day39_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("src/day39_Exceptions/Test.txt");

        /*
        Java'da bilgisayar�m�zdaki bir dosyaya eri�mek istiyorsak
        FileInputStream Class'�ndan yard�m al�r�z.

        Ayn� �ekilde Java'dan bilgisayardaki bir dosyaya ekleme veya
        g�ncelleme yapmak istiyorsak FileOutpuStream Class'�ndan yard�m al�r�z.

        G�r�ld��� gibi Compile time'da alt�n� k�rm�z� �izen her durum
        Compile Time Error de�ildir. (new FileInputStream i�in)

        Java'da baz� exception'lar da Compile Time Exception'dir.
        �zellikle dosya okuma ve yazma ile ilgili exception'lar
        COMPILE TIME EXCEPTION'd�r.
        **********
        Compile Time Exception olu�tu�unda Java 2 ��z�m �nerir:
        1 - Try / Catch ile �evrelemek.
        2 - Method Signature'�na THROWS keyword� ile beklenen
            exception t�r�n� yazmak.
        **********
        THROWS EXCEPTION, sadece olay�n fark�nda oldu�umuzun
        deklarasyonudur. Exception'�n Handle edilmesinde hi�
        bir rol� yoktur. Yani Try/Catch ile (handle edemedi�imiz)
        kontrol alt�na ald���m�z exceptionlarda kod �al��maya
        devam ediyordu. Ancak Throws Exception yazd���m�zda Java
        bir exxception ile  kar��la��rsa hi� bir �ey yapmam���z
        gibi hata mesaj� yay�nlay�p, �al��may� durdurur.
         */

    }
}
