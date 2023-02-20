package src.day32_StringBuilder;

public class C04_subSquence {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Kayra");
        sb.substring(0,3);
        // Bu method String döndürdüðü için SrtringBuilder'in eski halini deðiþtiremez.
        System.out.println("sb = " + sb); // Kayra


        sb.subSequence(0,3);
        System.out.println("sb = " + sb); // Kayra
    }
}
