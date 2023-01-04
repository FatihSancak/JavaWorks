package day05_matematikselIslemler;

public class C02_PrePostIncrement {
    public static void main(String[] args) {


        int sayi;


        System.out.println("Pre -Post, Sayi 10 ********************");
        sayi= 10;
        System.out.println("Pre increment : "+ ++sayi); // 11
        System.out.println("Post Increment : " + sayi++); // 11
        System.out.println("Post Increment'ten sonra : "+ sayi); // 12


        System.out.println("Post -Pre, Sayi 8 ********************");
        sayi = 8;
        System.out.println("Post Increment : " + sayi++); // 8
        System.out.println("Pre increment : "+ ++sayi); // 10
        System.out.println("Post Increment'ten sonra : "+ sayi); // 10




    }
}
