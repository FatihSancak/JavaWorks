package src.day37_overridding;

public class EToyota extends DAraba {
    void marka() {
        // super.marka();
        /*
        e�er hem overridden hem de overridding method'un �al��mas�n� istersek ilk sat�ra
        super.marka()
        yaz�labilir. �lk sat�r olmak zorunda de�ildir.
        Ancak parent �zelliklerini almas� i�in genelde ,
        ilk sat�rda yaz�l�r.
         */
        System.out.println("Markam�z TOYOTA");
    }
    void motor(){
        System.out.println("Toyota ara�lar TOYOTA marka motoru kullan�r");
    }
}
