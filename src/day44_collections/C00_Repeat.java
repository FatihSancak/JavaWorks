package src.day44_collections;

public class C00_Repeat {
    /*
    1. Iterate: Collections'dan bazý yapýlar index desteklemez.
       Iterate, collection içindeki tüm elemetleri bize getirebilecek
       ve gerektiðinde elementleri deðiþtirecek bir taþýyýcýdýr.
    2. Iterate: Ötelemek demektir. Iterator'i ilk oluþturduðumuzda
       Java iterator'ý collection'ýn ilk elemenetinin yanýna koyar,
       iterator'ý next() ve previos() ile her hareket ettirdiðimizde
       Java iterator'u bir sonraki elemena taþýr ve taþýnýrken pass
       ettiði elementi yüklenir.
    3. Üzerine aldýðý elementi remove() ile silebilir, istersek yazdýrabilir
       veya set() ile deðiþtirebilir.
    4. Java'da iki iterator kullanýlýr, Iterator class'ý sadece 3 method
       barýndýrdýðý için çok kullanýþlý deðildir. Sadece ileri doðru gider,
       remove ile element silinebilir veya yazdýrabilir.
    5. ListIterator ise Iterator'ýn child'i olmasýna raðmen daha fazla
       method barýndýrýr. Ýleri ve geri harekete edebilir, set() ile
       elementleri deðiþtirebiliriz.
    6. hasNext() ve hasPrevious() method'larý yanýnda element olduðu
       müddetçe bize true döndürür. Bu method'larý while loop ile kullanarak,
       ileri geri olarak tüm elementler üzerinde gezinebiliriz.
    7. Iterator ve ListITerator interface olduklarýndan direk object üretemeyiz,
       bunun yerine bize iterator ve listIterator döndürecek method'lar kullanýrýz.

     */
}
