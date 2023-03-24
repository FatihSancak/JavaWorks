package src.day44_collections;

public class C00_Repeat {
    /*
    1. Iterate: Collections'dan baz� yap�lar index desteklemez.
       Iterate, collection i�indeki t�m elemetleri bize getirebilecek
       ve gerekti�inde elementleri de�i�tirecek bir ta��y�c�d�r.
    2. Iterate: �telemek demektir. Iterator'i ilk olu�turdu�umuzda
       Java iterator'� collection'�n ilk elemenetinin yan�na koyar,
       iterator'� next() ve previos() ile her hareket ettirdi�imizde
       Java iterator'u bir sonraki elemena ta��r ve ta��n�rken pass
       etti�i elementi y�klenir.
    3. �zerine ald��� elementi remove() ile silebilir, istersek yazd�rabilir
       veya set() ile de�i�tirebilir.
    4. Java'da iki iterator kullan�l�r, Iterator class'� sadece 3 method
       bar�nd�rd��� i�in �ok kullan��l� de�ildir. Sadece ileri do�ru gider,
       remove ile element silinebilir veya yazd�rabilir.
    5. ListIterator ise Iterator'�n child'i olmas�na ra�men daha fazla
       method bar�nd�r�r. �leri ve geri harekete edebilir, set() ile
       elementleri de�i�tirebiliriz.
    6. hasNext() ve hasPrevious() method'lar� yan�nda element oldu�u
       m�ddet�e bize true d�nd�r�r. Bu method'lar� while loop ile kullanarak,
       ileri geri olarak t�m elementler �zerinde gezinebiliriz.
    7. Iterator ve ListITerator interface olduklar�ndan direk object �retemeyiz,
       bunun yerine bize iterator ve listIterator d�nd�recek method'lar kullan�r�z.

     */
}
