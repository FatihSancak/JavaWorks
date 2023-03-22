package src.day41_abstractClass_Interface;

public class C01_Exceptions {
    /*
    throw
    ile kontrol� exception olu�tururken
    parametre olarak istedi�imiz hata mesaj�n� girebilirsiniz.
     */

    public static void main(String[] args) {
        try {
            calis();
        } catch (Exception e) {
            System.out.println((e.getMessage()));
        }
    }

    private static void calis() {
        throw new RuntimeException("�ok �al����");
    }
}
