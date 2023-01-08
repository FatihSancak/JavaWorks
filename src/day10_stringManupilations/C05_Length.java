package src.day10_stringManupilations;
public class C05_Length {
    public static void main(String[] args) {
        String str = "Java öğren. işi kap";
        System.out.println(str.length());
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.charAt(str.length() - 3));
        // Java'da null pointer (işaretleyici) bir değer değil karşısına
        // yazılan değerin hiç bir değer almadığının işaretcisidir.

        String str2 = ""; // Değer atanmıştır. Atanan değer : hiçliktir.
        String str3 = null; // Değer atanmamıştır. null bu değer atamamayı işaret etmektedir.

        System.out.println(str2.length());
        //System.out.println(str3.length());
        // NullPointerExeption hatası döner.

        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('t'));
    }
}
