package src.day32_stringBuilder;

public class C07_delete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java her zaman �ok g�zeldir.");

        sb.delete(8, 9);
        System.out.println(sb); // Java herzaman �ok g�zeldir.

        sb.deleteCharAt(8);
        System.out.println(sb); // Java heraman �ok g�zeldir.

        // Ba�tan ba�layarak her grupta ilk harfi silip kalan� yazd�r�n

        int son = sb.length();

        for (int i = 0; i < son; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);
        }
    }
}
