package src.day33_Encapsulaiton;

public class Araba_Runner {
    public static void main(String[] args) {
        Araba arb1 = new Araba();
        // arb1 object'i üzerinden marka deðiþkenine ulaþýldý, deðiþtirildi (set / yazma) ve yazdýrýldý (get / okuma)
        arb1.marka = "Toyota";
        System.out.println("arb1.marka = " + arb1.marka);

        // Access Modifieer kullanarak marka variable'ina ulaþýmý
        // tamamen serbest yapabilir veya tamamen engelleyebiliriz.
        // private yapýlan modele ise hiç ulaþýlmaz.
        // Access Modifier ya hep ya hiç der.

        // model'i deðiþtirelim ama göremeyelim
        // yakýtý da görelim ama deðiþtiremeyelim

        // set ve get yetkilerini özel olarak tanýmlamak isterseniz,
        // 1. adým : Özel yetki tanýmlanacak variable'larý PRIVATE yapmalýsýnýz
        //           Private bir data'ya baþka class'lardan ulaþmak mümkün olmadýðýndan
        // 2. adým : Set yetkisi için SETTER, Get yetkisi için GETTER method'larý oluþturulmalýdýr.
        //

        arb1.setModel("Corolla");
        // Model olarak Corolla atandý.
        // Model yazdýralamaz. Çünkü getter() method'u yoktur

        System.out.println(arb1.getYakit());
        // "Eletrikli" bilgisini yazdýrýlabilir.
        // Yakýtý deðiþtiremezsiniz setter() method'u yoktur.
    }
}
