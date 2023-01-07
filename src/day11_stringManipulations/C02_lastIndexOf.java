package src.day11_stringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {
        String cumle = "Java çok kolay, Java çok güzel";
        String kelime = "Java";
        // Verilen kelime için aşağıdaki şartlardan uygun olanı yazan bir program yazınız:
        // verilen kelimde cümlede kullanılmamış
        // verilen kelime cümlede sadece bir kere kullanılmış
        // verilen kelime cümlede birden fazla kullanılmış

        int kelimeilkindex = cumle.indexOf(kelime);
        int kelimeSonIndex = cumle.lastIndexOf(kelime);

        if (kelimeilkindex == -1) {
            System.out.println("Kelime Cümlede Kullanılmamış");
        } else if (kelimeilkindex == kelimeSonIndex) {
            System.out.println("Kelime bir kere kullanılmıştır");
        } else {
            System.out.println("Verilen kelime birden fazla kullanımış");
        }
    }
}