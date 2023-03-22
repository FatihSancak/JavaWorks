package src.day42_abstractClass_Interfaces;

public interface I02_Interfaces {
    int SAYI=30;
    String ISIM = "SANCAK KOLEJ�";
    /*
    interface bir class de�ildir.

    Abstract class'lar abstraction (soyutla�t�rma / kural koyma)
    i�lemini yap�yordu. Ancak abstract bir class'ta abstract olmayan
    method'lar da olabilir bu da tam anlam�yla abstraction yapmaya izin vermez.

    E�er Java'da i�inde hi� oncrete method olmas�n dedi�imiz
    bir class olu�turmak istiyorsan�z bunu class de�il
    INTERFACE yapmal�s�n�z.

    1- INTERFACE'LERDE CONCRETE METHOD OLMAZ.
    2- �nterface'ler full abstraction yapt���ndan interface'lerden
       object olu�turulamaz.

        �nterface olan List'den direk object olu�turulamaz.

        List<String> liste = new List<>();

        Bunun yerine constructor'� List'in child'� olan ArrayList'den se�eriz.
        List<String> liste = new ArrayList<>();

     3- Class'larda bir child birden fazla parent edinemez.
        Ancak Interface'lerde concrete method olmad���ndan
        her method'u child class'da override etmek ZORUNLULU�U vard�r
        Override ederken kimin soyledi�ini override etti�imizin �nemi yok

     4- Interface'lar neyin yap�lmas� gerekti�ini s�yler. Ama nas�l
        yap�laca��na kar��maz.

     */
}
