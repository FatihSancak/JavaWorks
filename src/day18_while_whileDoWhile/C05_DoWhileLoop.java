package src.day18_while_whileDoWhile;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
        /*
        9 den 190 e kadar 7 nin kati olan tum tamsayilari ekrana yazdiriniz.
         */

        int bas = 9;
        int bitis = 190;
        int temp=bas;


        // while
        System.out.println("while loop ile çözüm :");

        while (temp<bitis){
            if (temp%7==0){
                System.out.print(temp+" ");
            }
            temp++;
        }

        // do while
        System.out.println("");
        temp = bas;
        System.out.println("do while loop ile çözüm :");

        do{

            if (temp%7==0){
                System.out.print(temp+" ");
            }
            temp++;
        }while(temp<bitis);


        // for loop
        System.out.println("");
        temp=bas;
        System.out.println("for loop ile çözüm :");
        for (int i = temp; i < bitis; i++) {

            if(i%7==0) {
                System.out.print(i + " ");
            }
        }
    }
}
