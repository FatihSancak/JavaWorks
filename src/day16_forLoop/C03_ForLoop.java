package src.day16_forLoop;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {

        // 10 ile 30 arasındaki (10 ve 30 dahil) sayıları aralarında
        // virgül olarak aynı sayırda yazdırın

        int bas, son;
        bas = 10;
        son = 30;

        for (int i = bas; i <= son ; i++) {
            System.out.print(i);
            if (i!=son){
                System.out.print(",");
            }
        }
    }
}
