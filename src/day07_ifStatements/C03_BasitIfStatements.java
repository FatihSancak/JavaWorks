package day07_ifStatements;

public class C03_BasitIfStatements {
    public static void main(String[] args) {
        int sayi = 20;
        if (sayi > 0) {
            System.out.println("sayi pozitif");
            System.out.println("pozitif kalacaktır");
            System.out.println("ucuncu satır");
        }
        if (sayi % 2 == 0) {
            System.out.println("Sayı çift");
            System.out.println("çift kalacaktır");
        }
        if (sayi % 5 == 0) {
            System.out.println("sayı beşin katı");
        }
        /*
        Basit if cümlelerin kodun diğer parçalarından bağımsızdır.
        sadece bir şart kontrol edilir, şart sağlanıyorsa,
         if body çalışır  yoksa çalışmaz.
        birden fazla basit if cümlesi varsa girilen şarta bağlı olarak;
         1. tümünde if body si çalışabilir
         2. kısmen if body leri çalışabilir
         3. hiç bir if body si de çalışmayabilir.
         */

    }
}
