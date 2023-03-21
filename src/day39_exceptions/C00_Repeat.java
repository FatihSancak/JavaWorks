package src.day39_exceptions;

public class C00_Repeat {
    /*
    1. Exception : Java'da ortaya ��kmas� muhtemel istisnalard�r.
    2. Java nerede ne yapaca��n� bilir. E�er Java'n�n istedi�i kodu yazmassak,
       Java Compile Time'da farkederse bunu alt�n� �izerek uyar�r.
       Ancak bazen syntax a��s�ndan her�ey normal olsa da Java'n�n ��zemeyece�i
       durumlar ortaya ��kar bu durumda Java �al��may� durdurur (stop execution)
       ve durumu bize rapor etmek i�in k�rm�z� yaz�lar yazar
    3. Java'n�n verdi�i hata mesaj�nda :
        1. Hatan�n hangi sat�rda oldu�u
        2. Hatan�n kayna��
        3. Exception t�r� yaz�l�d�r.
    4. E�er biz kodumuzu yazarken sorun olmas� muhtemel noktalar� �ng�rebiliyorsak
       Java'ya b�yle bir exception ile kar��la�t���nda ne yapmas� gerekti�ini s�yleyebiliriz.
    5. Biz e�er Java'n�n exception ile kar��la�t���nda �al��maya devam etmesini istiyorsak
       o zaman exception olu�turmas� muhtemel olan kod blo�unu Try/Catch ile �evreleyebiliriz.

TRY / CATCH

    6. TRY body'si exception olu�turmas� �ng�r�len kodlar� i�erir.
    7. CATCH'den sonra yaz�lan parantez bekledi�imiz exception'�n t�r�n� ve exception olu�ursa
       i�ine atama yapaca��m�z object'i i�erir (e)
    8. CATCH Body'si ise exception yakaland���nda yap�lacak i�lemi i�erir.
    9. CATCH Body'sinde hata raporu vermek istiyorsak bir SOUT ile yazd�r�labilece�i gibi, Exception'�
       store etti�imiz e object'si �zerinden haz�r hata mesajlar�n� da kullanabiliriz.
       e object'sini kullanarak hata raporunu yazd�rd���m�zda ekranda yine k�rm�z�
       yaz�lar g�r�r�z ama bu kodun durdu�u i�in de�il biz yazd�rmak istedi�imiz i�in olur.
       E�er istemezsek yaz�lar�n hi� birini yazd�rmasak da olur.
   10. TRY blo�u tek ba��na KULLANILAMAZ, TRY blo�unun yan�na CATCH blok(lar)� ve/veya FINALLY
       blo�u kullan�lmal�d�r.
    */
}
