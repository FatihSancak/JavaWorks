package src.day40_final;

public class C00_Repeat {
    /*
    1. E�er birden fazla exception olu�turma ihtimali ta��yorsa,
       bu durumda birden fazla try/catch kullanabiliriz.

    2. Exception kayna�� kodun farkl� sat�rlar� ise, o sat�rlar�
       ayr� ayr� handle edebiliriz.

    3. Ancak ayn� kod blo�u birden fazla exception ihtimali
       i�eriyorsa, i� i�e bir TRY ve birden fazla da CATCH olu�turabiliriz.
       Muhtemelen exception'lar� kapsayan tek bir exception varsa sadece
       o yaz�labilir.

    4. Olu�acak exceptionlar birbiri ile parent-child il�ikisine sahipse
       Child �ste, Parent alta yaz�lmal�d�r. Bu bir tercih de�ildir.

    5. E�er parent yukar�da child a�a��da olursa, Java CTE verir.
       ��nk� a�a��daki child exception, ula��lamaz konumda olacakt�r.

    6. E�er compile time exception handle etmek de�il de sadece
       Java'daki k�rm�z� �izgileri kald�rmak isterseniz method Signature'�na
       THROWS keyword ile olu�abilecek execption class isimlerini yazar�z

    7. E�er kodu herhangi bir sat�r�nda, bir exception throw etmek
       istersek throw new ExceptionIsmi kullanabiliriz

     */
}
