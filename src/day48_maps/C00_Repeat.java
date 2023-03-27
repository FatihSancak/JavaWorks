package src.day48_maps;

public class C00_Repeat {
    /*

    MAPS

    1.  Map'lerde keyve value'lara mp.keySet() ve map.values() ile ula��labilir.,
        ancak key ve value'ya birlikte ula�mak istersek 2 y�ntem kullan�labilir :

            - keyset() ile key'leri al�p Set'e koyabilir, set'deki key �zerinden
              map.getKey(key) ile value'ya ula��labilir ve manipule edilebilir.

            - Java key ve valur'larla ile ayr� ayr� u�ra�mamam�z i�in Entry intefeace'ini
              olu�turmu�tur. Entry hem key hem de value i�erdi�i i�in map'in �zerinde gezmek
              ve update etmek daha kolay olacakt�r.

    2.  UPDATE : �ster keyset() method'u istenirse Entry ile yap�lm�� olan her de�i�ikli�in
        kal�c� olmas� i�in en son map'i update etmek gerekir.

        Bunun i�in de�i�iklik yapt���m�z value'yu put(key, yeniValue) olarak map'e ekleyebilir
        veya entry.setValue(yeniDeger) ile entry �zerinden map'i update edebiliriz.

    3.  map'de containsKey() ve containsValue() method'lar� ile key veya valur'n�n map'de
        olup olmad���n� kontrol edebiliriz. Burada dikkat edilmesi gereken �ey, value'yi bir b�t�n
        olarak arayabiliriz, value i�ersindeki bir String'i aratamay�z.
    */
}
