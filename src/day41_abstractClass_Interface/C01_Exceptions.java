package src.day41_abstractClass_Interface;

public class C01_Exceptions {
    /*
    throw
    ile kontrolü exception oluþtururken
    parametre olarak istediðimiz hata mesajýný girebilirsiniz.
     */

    public static void main(String[] args) {
        try {
            calis();
        } catch (Exception e) {
            System.out.println((e.getMessage()));
        }
    }

    private static void calis() {
        throw new RuntimeException("Çok Çalýþþþ");
    }
}
