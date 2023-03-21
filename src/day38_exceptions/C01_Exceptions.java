package src.day38_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {
        int a = 1000;
        int b = 50;
        int sayac = 1;

        while (sayac<1000){
            if (b==0){
                System.out.println("Ýþlem yapýlýrken 0 oldu, Dikkat etmelisin");
            }else{
            System.out.println(a/b);
            }
            b--;
            sayac++;
        }

    }
}
