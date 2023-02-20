package src.day32_StringBuilder;

public class C01_OlusturmaYontemleri {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Java Hayattýr");
        StringBuilder sb3 = new StringBuilder(5);

        System.out.println("sb1.length() = " + sb1.length()); // 0
        System.out.println("sb1.capacity() = " + sb1.capacity()); // 16

        System.out.println("sb2.length() = " + sb2.length()); // 13
        System.out.println("sb2.capacity() = " + sb2.capacity()); // 29

        System.out.println("sb3.length() = " + sb3.length()); // 0
        System.out.println("sb3.capacity() = " + sb3.capacity()); // 5

        sb1.append("Java"); // Ekleme
        System.out.println("sb1.length() = " + sb1.length()); // 4
        System.out.println("sb1.capacity() = " + sb1.capacity()); // 16

        sb1.append(" Candýr"); // Ekleme
        System.out.println("sb1.length() = " + sb1.length()); // 11
        System.out.println("sb1.capacity() = " + sb1.capacity()); // 16

        sb1.append(", bilen bilir."); // Ekleme
        System.out.println("sb1.length() = " + sb1.length()); // 25
        System.out.println("sb1.capacity() = " + sb1.capacity()); // 34 [(16*2)+2]

        StringBuilder sb4 = new StringBuilder();
        sb4.append("Java Hayattýr");
        System.out.println("sb4.length() = " + sb4.length()); // 13
        System.out.println("sb4.capacity() = " + sb4.capacity()); // 16
    }
}
