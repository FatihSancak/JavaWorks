package src.day32_stringBuilder;

public class C07_delete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java her zaman çok güzeldir.");

        sb.delete(8, 9);
        System.out.println(sb); // Java herzaman çok güzeldir.

        sb.deleteCharAt(8);
        System.out.println(sb); // Java heraman çok güzeldir.

        // Baþtan baþlayarak her grupta ilk harfi silip kalaný yazdýrýn

        int son = sb.length();

        for (int i = 0; i < son; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);
        }
    }
}
