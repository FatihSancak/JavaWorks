package src.day48_maps;

public class C00_Repeat {
    /*

    MAPS

    1.  Map'lerde keyve value'lara mp.keySet() ve map.values() ile ulaþýlabilir.,
        ancak key ve value'ya birlikte ulaþmak istersek 2 yöntem kullanýlabilir :

            - keyset() ile key'leri alýp Set'e koyabilir, set'deki key üzerinden
              map.getKey(key) ile value'ya ulaþýlabilir ve manipule edilebilir.

            - Java key ve valur'larla ile ayrý ayrý uðraþmamamýz için Entry intefeace'ini
              oluþturmuþtur. Entry hem key hem de value içerdiði için map'in üzerinde gezmek
              ve update etmek daha kolay olacaktýr.

    2.  UPDATE : Ýster keyset() method'u istenirse Entry ile yapýlmýþ olan her deðiþikliðin
        kalýcý olmasý için en son map'i update etmek gerekir.

        Bunun için deðiþiklik yaptýðýmýz value'yu put(key, yeniValue) olarak map'e ekleyebilir
        veya entry.setValue(yeniDeger) ile entry üzerinden map'i update edebiliriz.

    3.  map'de containsKey() ve containsValue() method'larý ile key veya valur'nýn map'de
        olup olmadýðýný kontrol edebiliriz. Burada dikkat edilmesi gereken þey, value'yi bir bütün
        olarak arayabiliriz, value içersindeki bir String'i aratamayýz.
    */
}
