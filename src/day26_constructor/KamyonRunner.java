package src.day26_constructor;

public class KamyonRunner {
    public static void main(String[] args) {
        Kamyon kamyon1 = new Kamyon();
        System.out.println("Kamyon 1 özellikleri : \n" + kamyon1.toString());

        Kamyon kamyon2 = new Kamyon("Mercedes", "4140", 2005, 50000);
        System.out.println("Kamyon 2 Özellikleri : \n" + kamyon2.toString());

        Kamyon kamyon3 = new Kamyon("Man", "as900", 2007, 45000);
        System.out.println("Kamyon 3 özellikleri :\n" + kamyon3.toString());

        Kamyon kamyon4 = new Kamyon("Scania", "S540");
        System.out.println("Kamyon 4 Özellikleri\n" + kamyon4.toString());

        Kamyon kamyon5 = new Kamyon(2007,4500);
        System.out.println("Kamyon 5 Özellikleri\n" + kamyon5.toString());
    }
}
