package src.day28_staticBlock;

public class C02_PastByValue {
    public static void main(String[] args) {
        double satisFiyati = 100;
        System.out.println(indirimlifiyat(satisFiyati)); // 90
        System.out.println("satisFiyati = " + satisFiyati); // 100
        System.out.println(indirimlifiyat(satisFiyati)); // 90

        // iki faklý method'da satisfiyati isminde variable olabilir.
        // Java buna itiraz etmez çünkü scope'larý farklýdýr.

    }
    public static double indirimlifiyat(double orjinalfiyat){
        // methodumuz 10% indirip yapýp yeni  fiyatý main method'a döndürsün

        double satisfiyati = orjinalfiyat *0.9;
        return satisfiyati;
    }
}
