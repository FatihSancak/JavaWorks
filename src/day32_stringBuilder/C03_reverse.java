package src.day32_stringBuilder;

public class C03_reverse {

    public static void main(String[] args) {
        // verilen bir input'u tersine �evirip bize d�nd�ren bir method olu�turun

        String input = "Hey gidi For Loop g�nleri";
        String tersInput = tersineCevir(input);
        System.out.println("tersInput = " + tersInput);
    }

    public static String tersineCevir(String input) {
        StringBuilder sb = new StringBuilder(input);
        input = sb.reverse().toString();
        return input;
        // veya;
        // return sb.reverse().toString();
    }

}
