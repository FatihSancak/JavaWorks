package src.day15_overloading_for_loop;

public class C08_Faktoriyel {
    public static void main(String[] args) {
        /*
        input olarak verilen bir sayı için
        faktöriyel hesaplayıp yazdıran bir method yazdırın,

        verilen sayı sıfır,  negatif veya 20'den buyuk olursa
        "girilen sayının faktöriyeli hesaplanamaz"
        uyarısı versin.

         */
        int input = -2;
        faktoriyelAl(input);
    }

    public static void faktoriyelAl(int i) {
        int faktoriyel=1;
        if (i<0 || i>20){
            System.out.println("Girilen Sayının faktöriyeli hesaplanamaz");
        } else if (i==0) {
            System.out.println("0 Sayısının Faktöryeli 1'dir.");
        } else{
            for (int j = 1; j <= i; j++) {
                faktoriyel*=j;
            }
            System.out.println("Girilen "+ i +"! faktoriyel sonucu = " + faktoriyel);
        }
    }
}
