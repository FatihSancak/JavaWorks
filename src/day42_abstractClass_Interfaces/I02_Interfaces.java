package src.day42_abstractClass_Interfaces;

public interface I02_Interfaces {
    int SAYI=30;
    String ISIM = "SANCAK KOLEJÝ";
    /*
    interface bir class deðildir.

    Abstract class'lar abstraction (soyutlaþtýrma / kural koyma)
    iþlemini yapýyordu. Ancak abstract bir class'ta abstract olmayan
    method'lar da olabilir bu da tam anlamýyla abstraction yapmaya izin vermez.

    Eðer Java'da içinde hiç oncrete method olmasýn dediðimiz
    bir class oluþturmak istiyorsanýz bunu class deðil
    INTERFACE yapmalýsýnýz.

    1- INTERFACE'LERDE CONCRETE METHOD OLMAZ.
    2- Ýnterface'ler full abstraction yaptýðýndan interface'lerden
       object oluþturulamaz.

        Ýnterface olan List'den direk object oluþturulamaz.

        List<String> liste = new List<>();

        Bunun yerine constructor'ý List'in child'ý olan ArrayList'den seçeriz.
        List<String> liste = new ArrayList<>();

     3- Class'larda bir child birden fazla parent edinemez.
        Ancak Interface'lerde concrete method olmadýðýndan
        her method'u child class'da override etmek ZORUNLULUÐU vardýr
        Override ederken kimin soylediðini override ettiðimizin önemi yok

     4- Interface'lar neyin yapýlmasý gerektiðini söyler. Ama nasýl
        yapýlacaðýna karýþmaz.

     */
}
