package src.day17_nestedForLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {
        /*
        20 den 50 e kadar (sınırlar dahil tum ÇİFT tamsayilari ekrana yazdiriniz.
         */
        int baslangic = 20;
        int bitis = 50;

        for (int i = baslangic; i <=bitis ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

        System.out.println();
        System.out.println("**************");

        // başlangıç değeri değişmesini istemediğimiz için başka bir değişkene alıyorum.
        // değişkene almadığımızda while loop sonucunda başlangıç değeri şarta bağlı
        // olarak devamlı artırılacak ve bozulacaktır.

        int tmp=baslangic;

        while(tmp<50){
            if(tmp%2==0) {
                System.out.print(tmp + " ");
            }
            tmp++;
        }
        System.out.println(baslangic);
    }
}
