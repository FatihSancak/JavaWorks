package src.day45_collections;

public class C00_Repeat {
    /*
    1.  Collections : Java'da birden fazla data barýndýrabilen
        yapýlardýr. Interface ve Class'dan oluþan
    2.  Interface'ler ortak özelliklere sahip child class'larý
        bir çatý altýnda toplamak için kullanýlýr
    3.  Collections
        |
        -- List
        |
        -- Queue( ce Deque)
        |
        -- Set
     4. Set -> (Küme) elementler tekrarsýz
        Linked -> baðle demek (halay) ekleme ve çýkarma çok iyi,
            arama çok yavaþ
        Hash -> her bir element için unique bir hash codu oluþturup
            arþive yerleþtirir. Bulmada hýzlý
        Queue -> (Yemek Kuyuruðu) eklenen sona eklenip, aurýlan
            baþtan ayrýlýr
     5. LinkedList, birbirine baðlý mode'ler oluþur, her bir node'da
        bir deðer ve sonraki mode'un adresi bulunur. ÝLk element Head'dir
        head sadece adres içerir, deðer içermez, son elementte ise deðer
        vardýr adres olarak null pointer kullanýr.
     6. LinkedList'in 3 tane parent Interface'i vardýr. LinkedList
        oluþtururken data türü
            LinkedList seçilirse tüm parentlerindeki özellikleri
            kullanabiliriz.(list, Queue, Deque)
            List, Queue veya Deque seçilirse o interface'deki özellikleri
            kullanabilir.
    */
}
