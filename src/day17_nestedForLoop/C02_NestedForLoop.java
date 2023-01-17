package src.day17_nestedForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {
        /*
        Verilen sayıya göre carpım tablosu oluşturun.

        input 3
        1 2 3
        2 4 6
        3 6 9

        eğer dikdörtgen biçiminde bir çıktı alınacaksa içiçe for loop kullanılır.
        */
        int input =10;
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j<=input; j++) {
                System.out.print(i*j+"\t");
            }
            System.out.println("");
        }
    }
}
