package src.day10_stringManupilations;

public class C03_equels {
    public static void main(String[] args) {
        String str1 = "Ali Can";
        String str2 = "Ali CAN";
        String str3 = "Alİ Can"+"";
        String str4 = "Ali Can";
        String str5 = new String("Ali Can");

        System.out.println(str1 == str2); // false

        System.out.println(str1 == str3); // true - false
        System.out.println(str1.equals(str3)+"eq"); // true - false

        System.out.println(str1==str5); // false
        System.out.println(str1.equals(str5)+"eq"); //true

        System.out.println(str1.equals(str4));// true

        System.out.println(str3.equals(str5)+"eq");// false
        System.out.println(str3==str5);// false

    }
}
