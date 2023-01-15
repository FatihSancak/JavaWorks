package src.day15_overloading_for_loop;

public class C03_Overloading {
    public static void main(String[] args) {
        topla(5,7); // 12
        topla(5.3,9); // 14,3
        topla(3.4,6.1); // 9,5
    }
    public static void topla(int sayi1, int sayi2){
        System.out.println("İki integer'in toplamı : "+ (sayi1+sayi2));
    }
    /*
    ********************
    Bir class'da parametre sayısı ve parametre data türleri aynı olan 2 method
    OLUŞ-TU-RA-MAZ-SIN !
    ********************

    public static void topla(int sayi3, int sayi4){
        System.out.println("İki integer'in toplamı : "+ sayi3+sayi4);
    }
     */
    public static void topla(double sayi1, int sayi2){
        System.out.println("Bir double ile integer'in toplamı : "+ (sayi1+sayi2));
    }
    public static void topla(int sayi1, double sayi2){
        System.out.println("Bir integer ile double'in toplamı : "+ (sayi1+sayi2));
    }
    public static void topla(double sayi1, double sayi2){
        System.out.println("İki double'in toplamı : "+( sayi1+sayi2));
    }
}
