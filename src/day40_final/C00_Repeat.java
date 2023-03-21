package src.day40_final;

public class C00_Repeat {
    /*
    1. Eðer birden fazla exception oluþturma ihtimali taþýyorsa,
       bu durumda birden fazla try/catch kullanabiliriz.

    2. Exception kaynaðý kodun farklý satýrlarý ise, o satýrlarý
       ayrý ayrý handle edebiliriz.

    3. Ancak ayný kod bloðu birden fazla exception ihtimali
       içeriyorsa, iç içe bir TRY ve birden fazla da CATCH oluþturabiliriz.
       Muhtemelen exception'larý kapsayan tek bir exception varsa sadece
       o yazýlabilir.

    4. Oluþacak exceptionlar birbiri ile parent-child ilþikisine sahipse
       Child üste, Parent alta yazýlmalýdýr. Bu bir tercih deðildir.

    5. Eðer parent yukarýda child aþaðýda olursa, Java CTE verir.
       Çünkü aþaðýdaki child exception, ulaþýlamaz konumda olacaktýr.

    6. Eðer compile time exception handle etmek deðil de sadece
       Java'daki kýrmýzý çizgileri kaldýrmak isterseniz method Signature'ýna
       THROWS keyword ile oluþabilecek execption class isimlerini yazarýz

    7. Eðer kodu herhangi bir satýrýnda, bir exception throw etmek
       istersek throw new ExceptionIsmi kullanabiliriz

     */
}
