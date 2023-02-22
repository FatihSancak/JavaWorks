package src.day34_Inheritance;

public class ToyotaCorolla extends Toyota{
    public static void main(String[] args) {
        /*
        Childe Class'tan PArent Class'a eri�imde access modifier kurallar�n�
        by-pass edemeyiz. �rne�in;

        Parent Class'daki private class �yelerini child class'dan kullanamay�z

        Ayn� �ekilde parent ve child farkl� package'larda ise parent clas'daki
        default access modifier'i olan class �yerlerini child  class'dan kullanamay�z.
         */

        ToyotaCorolla arb1 = new ToyotaCorolla();

        System.out.println(arb1.marka); // Toyota
        System.out.println(arb1.model); // Model Belirtilmedi
    }
}
