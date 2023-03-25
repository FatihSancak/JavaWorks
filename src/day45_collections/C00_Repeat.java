package src.day45_collections;

public class C00_Repeat {
    /*
    1.  Collections : Java'da birden fazla data bar�nd�rabilen
        yap�lard�r. Interface ve Class'dan olu�an
    2.  Interface'ler ortak �zelliklere sahip child class'lar�
        bir �at� alt�nda toplamak i�in kullan�l�r
    3.  Collections
        |
        -- List
        |
        -- Queue( ce Deque)
        |
        -- Set
     4. Set -> (K�me) elementler tekrars�z
        Linked -> ba�le demek (halay) ekleme ve ��karma �ok iyi,
            arama �ok yava�
        Hash -> her bir element i�in unique bir hash codu olu�turup
            ar�ive yerle�tirir. Bulmada h�zl�
        Queue -> (Yemek Kuyuru�u) eklenen sona eklenip, aur�lan
            ba�tan ayr�l�r
     5. LinkedList, birbirine ba�l� mode'ler olu�ur, her bir node'da
        bir de�er ve sonraki mode'un adresi bulunur. �Lk element Head'dir
        head sadece adres i�erir, de�er i�ermez, son elementte ise de�er
        vard�r adres olarak null pointer kullan�r.
     6. LinkedList'in 3 tane parent Interface'i vard�r. LinkedList
        olu�tururken data t�r�
            LinkedList se�ilirse t�m parentlerindeki �zellikleri
            kullanabiliriz.(list, Queue, Deque)
            List, Queue veya Deque se�ilirse o interface'deki �zellikleri
            kullanabilir.
    */
}
