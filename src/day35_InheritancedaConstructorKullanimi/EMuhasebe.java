package src.day35_InheritancedaConstructorKullanimi;

public class EMuhasebe extends DPersonel{
    EMuhasebe(){
        System.out.println("Muhasebe Parametresiz cons.");
    }
    EMuhasebe(String isim){
        System.out.println("Muhasebe Parametresli cons.");
    }
}
