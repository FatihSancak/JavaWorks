package src.day18_while_doWhileLoop;
public class C02__WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
         */
        int input = 135836;

        int toplam=0;
        int birlerBasamagi =0;
        int temp=input;

        while(temp>0){
            birlerBasamagi = temp%10;
            toplam += birlerBasamagi;
            temp/=10;// birler basamağındaki sayıyı atarak basamak sayısını azaltarak diğer basamakların sayısal değerlerine ulaşılıyor.
        }
        System.out.println(input + " sayisinin rakamlar toplamı: "+ toplam);
    }
}