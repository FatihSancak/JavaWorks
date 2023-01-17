package src.day17_nestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen input'a göre * lardan oluşan bir üçgen oluşturun
        örnek
        input = 4 için

        output :

        *
        * *
        * * *
        * * * *

         */
        int input = 5;

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
