package src.Recap01;

public class R03_ifStatement02 {
    public static void main(String[] args) {
        /*
        not hesaplayıcısı:
        A--> 90 - 100
        B--> 80 - 89
        C--> 70 - 79
        D--> 60 - 69
        F-->  0 - 59
         */
        int not=75;

//        if (input<=59){
//            System.out.println("F");
//        } else if(input<=69){
//            System.out.println("D");
//        }else if (input<=79) {
//            System.out.println("C");
//        } else if (input<=89) {
//            System.out.println("B");
//        } else if (input>=90){
//            System.out.println("A");
//        }
        if(not>=90 && not <=100){
            System.out.println("A");
        }else if (not<90 && not >=80){
            System.out.println("B");
        }else if (not<80 && not >=70){
            System.out.println("C");
        }else if (not<70 && not >=60){
            System.out.println("D");
        }else {
            System.out.println("F");
        }

    }
}
