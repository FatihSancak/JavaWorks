package src.day12_stringManipulations;

public class C00_isEmpty {
    public static void main(String[] args) {
        String str = "Çalışırsanız, Java öğrenmek çok kolay";
        System.out.println(str.isEmpty()); // 1 --> false

        String str2 = "";
        System.out.println(str2.isEmpty());// 0 --> true

//        String str3 = null;
//        System.out.println(str3.isEmpty());// NullPointerException
    }
}
