package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
        /*
        Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
        Orn	:
            sayi1=10 ve sayi2=20;

        kod calistiktan sonra
            sayi1=20 ve
            sayi2=10
         */
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;

        // sayi3 temp (geçici) değişkenimiz
        sayi3=sayi2; // sayi3'e sayi2 atanıyor

        sayi2=sayi1; // sayi2'e sayi1 atanıyor

        sayi1=sayi3; // sayi1'e sayi3 atanıyor

        System.out.println("Swaptan sonraki sayi1 : "+ sayi1);
        System.out.println("Swaptan sonraki sayi2 : "+ sayi2);
    }
}
