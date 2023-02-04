package src.day24_arrayLists_forEachLoop;

public class C07_ArraydekiSayilarinKareToplam {
    public static void main(String[] args) {
        int[] sayilar = {2, 3, 4, 1, 5, 7, 6, 5, 4, 3};

        int kareToplam = 0;

        for (int each : sayilar
        ) {
            kareToplam += each * each;
        }
        System.out.println(kareToplam);
    }
}