package src.day39_exceptions;

public class C00_Repeat {
    /*
    1. Exception : Java'da ortaya çýkmasý muhtemel istisnalardýr.
    2. Java nerede ne yapacaðýný bilir. Eðer Java'nýn istediði kodu yazmassak,
       Java Compile Time'da farkederse bunu altýný çizerek uyarýr.
       Ancak bazen syntax açýsýndan herþey normal olsa da Java'nýn çözemeyeceði
       durumlar ortaya çýkar bu durumda Java çalýþmayý durdurur (stop execution)
       ve durumu bize rapor etmek için kýrmýzý yazýlar yazar
    3. Java'nýn verdiði hata mesajýnda :
        1. Hatanýn hangi satýrda olduðu
        2. Hatanýn kaynaðý
        3. Exception türü yazýlýdýr.
    4. Eðer biz kodumuzu yazarken sorun olmasý muhtemel noktalarý öngörebiliyorsak
       Java'ya böyle bir exception ile karþýlaþtýðýnda ne yapmasý gerektiðini söyleyebiliriz.
    5. Biz eðer Java'nýn exception ile karþýlaþtýðýnda çalýþmaya devam etmesini istiyorsak
       o zaman exception oluþturmasý muhtemel olan kod bloðunu Try/Catch ile çevreleyebiliriz.

TRY / CATCH

    6. TRY body'si exception oluþturmasý öngörülen kodlarý içerir.
    7. CATCH'den sonra yazýlan parantez beklediðimiz exception'ýn türünü ve exception oluþursa
       içine atama yapacaðýmýz object'i içerir (e)
    8. CATCH Body'si ise exception yakalandýðýnda yapýlacak iþlemi içerir.
    9. CATCH Body'sinde hata raporu vermek istiyorsak bir SOUT ile yazdýrýlabileceði gibi, Exception'ý
       store ettiðimiz e object'si üzerinden hazýr hata mesajlarýný da kullanabiliriz.
       e object'sini kullanarak hata raporunu yazdýrdýðýmýzda ekranda yine kýrmýzý
       yazýlar görürüz ama bu kodun durduðu için deðil biz yazdýrmak istediðimiz için olur.
       Eðer istemezsek yazýlarýn hiç birini yazdýrmasak da olur.
   10. TRY bloðu tek baþýna KULLANILAMAZ, TRY bloðunun yanýna CATCH blok(lar)ý ve/veya FINALLY
       bloðu kullanýlmalýdýr.
    */
}
