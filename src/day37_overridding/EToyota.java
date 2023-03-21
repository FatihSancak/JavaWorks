package src.day37_overridding;

public class EToyota extends DAraba {
    void marka() {
        // super.marka();
        /*
        eðer hem overridden hem de overridding method'un çalýþmasýný istersek ilk satýra
        super.marka()
        yazýlabilir. Ýlk satýr olmak zorunda deðildir.
        Ancak parent özelliklerini almasý için genelde ,
        ilk satýrda yazýlýr.
         */
        System.out.println("Markamýz TOYOTA");
    }
    void motor(){
        System.out.println("Toyota araçlar TOYOTA marka motoru kullanýr");
    }
}
