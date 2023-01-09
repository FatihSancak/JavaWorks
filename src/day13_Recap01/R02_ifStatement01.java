package src.day13_Recap01;

import java.util.Scanner;

public class R02_ifStatement01 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan Y/N ikisilinden birisini girdiğinde girdiği değeri
        ekrana yazdıran java kodunu yazınız
        input : Y, N
        OUYPUT: YES, NO
         */
        System.out.println("Orada Akşam mı? Y / N");
        Scanner scan = new Scanner(System.in);

        char cevap = scan.next().toUpperCase().charAt(0);

        if(cevap=='Y'){
            System.out.println("YES");
        } else if (cevap == 'N') {
            System.out.println("NO");
        }else {
            System.out.println("Geçerli bir giriş yapınız");
        }
    }
}
