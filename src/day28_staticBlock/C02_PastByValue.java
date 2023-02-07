package src.day28_staticBlock;

public class C02_PastByValue {
    public static void main(String[] args) {
        double satisFiyati = 100;
        System.out.println(indirimlifiyat(satisFiyati)); // 90
        System.out.println("satisFiyati = " + satisFiyati); // 100
        System.out.println(indirimlifiyat(satisFiyati)); // 90

        // iki fakl� method'da satisfiyati isminde variable olabilir.
        // Java buna itiraz etmez ��nk� scope'lar� farkl�d�r.

    }
    public static double indirimlifiyat(double orjinalfiyat){
        // methodumuz 10% indirip yap�p yeni  fiyat� main method'a d�nd�rs�n

        double satisfiyati = orjinalfiyat *0.9;
        return satisfiyati;
    }
}
