package src.day16_forLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        /*
        verilen bir pozitif tam sayının
        pozitif tam bolenlerini yazdırın
         */

        int input = 8056;

        for (int i = 1; i <= input; i++) {
            if(input%i==0){
                System.out.print(i +" ");
            }
        }
    }
}
