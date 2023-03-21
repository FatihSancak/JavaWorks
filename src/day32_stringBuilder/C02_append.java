package src.day32_stringBuilder;

public class C02_append {
    public static void main(String[] args) {

        // append() istediðimiz String'i en sona ekler.
        // insert() Strign'in arasýna ekleme yapmak için kullanýlýr.

        StringBuilder sb = new StringBuilder("Java daha ne yapsýn");

        sb.append("?");

        System.out.println("sb = " + sb);

        sb.append("Java",2,4);
        System.out.println("sb22 = " + sb); // Java herþeyi düþünmüþ daha ne yapsýn daha ne yapsýn?va

        sb.insert(4," herþeyi düþünmüþ daha ne yapsýn");
        System.out.println(sb); // Java herþeyi düþünmüþ daha ne yapsýn daha ne yapsýn?

        sb.insert(22,"valla valla",6,11);
        System.out.println(sb); // Java herþeyi düþünmüþ valladaha ne yapsýn daha ne yapsýn?

    }
}
