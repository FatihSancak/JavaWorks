package src.day15_overloading_for_loop;

public class C06_StringTerseCevirme {
    public static void main(String[] args) {
        // input olarak verilen String'i terse cevirip yazdıran bir method oluşturun
        String input = "Java gün gectikçe güzelleşiyor";

        terstenYazdir(input);
    }

    public static void terstenYazdir(String input) {
        String tersInput=input.substring(input.length()-1); // son harf indexini al ve son harfi substring e al.

        for (int i = input.length()-2; i >= 0 ; i--) {
            
            tersInput+=input.substring(i,i+1);
            //System.out.println("subStirng("+i + ","+(i+1)+")" );
        }
        System.out.println("tersInput = " + tersInput);
    }
}
