package src.day35_inheritancedaConstructorKullanimi;

public class GToyota {
    GToyota() {
        System.out.println("GToyota parametresiz cons");
    }

    GToyota(String isim) {
        // super(isim); Extends keyword ü olmadýðý için super cons. call'u java kabul etmez.

        System.out.println("GToyota parametreli cons");
    }
}
