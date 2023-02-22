package src.day34_Inheritance;

public class ToyotaCorolla extends Toyota{
    public static void main(String[] args) {
        /*
        Childe Class'tan PArent Class'a eriþimde access modifier kurallarýný
        by-pass edemeyiz. Örneðin;

        Parent Class'daki private class üyelerini child class'dan kullanamayýz

        Ayný þekilde parent ve child farklý package'larda ise parent clas'daki
        default access modifier'i olan class üyerlerini child  class'dan kullanamayýz.
         */

        ToyotaCorolla arb1 = new ToyotaCorolla();

        System.out.println(arb1.marka); // Toyota
        System.out.println(arb1.model); // Model Belirtilmedi
    }
}
