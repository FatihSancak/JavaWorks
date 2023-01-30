package src.day21_Arrays;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        // Verilen bir array’ın istenen bir elemanı içerip içermediğini kontrol edip,
        // bize treu veya false döndüren bir method oluşturun

        String[] isimler = {"Başak", "Nurullah", "Fatih", "Adem", "Enes"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Aradığınız ismi yazınız");
        String arananIsim = scan.nextLine();

        boolean sonuc = contains(isimler, arananIsim);

        if (sonuc) {
            System.out.println("Aradığınız isim mevcut");
        } else {
            System.out.println("Aranılan isim yok");
        }
    }

    public static boolean contains(String[] isimler, String arananIsim) {
        boolean sonucMethod = false;

        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].equalsIgnoreCase(arananIsim)) {
                sonucMethod = true;
            }
        }

        return sonucMethod;
    }
}