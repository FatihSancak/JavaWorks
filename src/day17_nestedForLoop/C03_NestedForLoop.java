package src.day17_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen yükseklik ve boy değerine göre
        yıldızlardan oluşan bir dikdörtgen oluşturun

        * * * * *
        * * * * *
        * * * * *
        3 x 5 (y x b)

         */
        int yukseklik = 8;
        int boy = 5;

        for (int i = 1; i <=yukseklik; i++) {
            for (int j = 1; j <= boy; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
