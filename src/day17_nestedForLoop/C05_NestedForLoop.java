package src.day17_nestedForLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen input'a göre
        * lardan oluşan sekli oluşturun

        input = 4

        *
        * *
        * * *
        * * * *
        * * *
        * *
        *

         */

        int input=5;
// artan kısım
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
// azalan kısım (starting ve ending value'lar değişmelidir.)
        for (int i = input-1; i >=1  ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
