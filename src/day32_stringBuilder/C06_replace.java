package src.day32_stringBuilder;

public class C06_replace {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Calm down");

        sb.replace(5,10,"up"); // Calm up
        System.out.println(sb);

        sb.replace(4,5,"---"); // Calm---up
        System.out.println(sb);

        sb.replace(4,7," "); // Calm up
        System.out.println(sb);

        sb.replace(5,7,"down"); // Calm down
        System.out.println(sb);
    }
}
