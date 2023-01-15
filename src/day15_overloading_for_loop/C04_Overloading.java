package src.day15_overloading_for_loop;
public class C04_Overloading {
    /*
    Java hangi method'un çalışacağına karar verirken optimizasyon yapar.
    - eğer hiç cast yapmadan bir method varsa onu kullanır.
    - eğer cast yapmadan kullanacağı bir method yoksa, en az cast yaparak kullanabileceği
    methodu tercih eder.
     */
    public static void main(String[] args) {
        topla(5,7); // 12
        topla(5.3,9); // 14,3
        topla(3.4,6.1); // 9,5
        topla(5,6.2); // buna uygun method olmamasına rağmen çalıştırır.
    }
    public static void topla(int sayi1, int sayi2){
        System.out.println("İki integer'in toplamı : "+ (sayi1+sayi2));
    }
    public static void topla(double sayi1, int sayi2){
        System.out.println("Bir double ile integer'in toplamı : "+ (sayi1+sayi2));
    }
    public static void topla(double sayi1, double sayi2){
        System.out.println("İki double'in toplamı : "+( sayi1+sayi2));
    }
}