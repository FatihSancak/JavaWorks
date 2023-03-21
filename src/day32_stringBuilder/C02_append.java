package src.day32_stringBuilder;

public class C02_append {
    public static void main(String[] args) {

        // append() istedi�imiz String'i en sona ekler.
        // insert() Strign'in aras�na ekleme yapmak i�in kullan�l�r.

        StringBuilder sb = new StringBuilder("Java daha ne yaps�n");

        sb.append("?");

        System.out.println("sb = " + sb);

        sb.append("Java",2,4);
        System.out.println("sb22 = " + sb); // Java her�eyi d���nm�� daha ne yaps�n daha ne yaps�n?va

        sb.insert(4," her�eyi d���nm�� daha ne yaps�n");
        System.out.println(sb); // Java her�eyi d���nm�� daha ne yaps�n daha ne yaps�n?

        sb.insert(22,"valla valla",6,11);
        System.out.println(sb); // Java her�eyi d���nm�� valladaha ne yaps�n daha ne yaps�n?

    }
}
