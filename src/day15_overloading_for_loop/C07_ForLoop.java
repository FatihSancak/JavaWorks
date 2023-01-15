package src.day15_overloading_for_loop;

public class C07_ForLoop {
    public static void main(String[] args) {
        C06_StringTerseCevirme.terstenYazdir("Merhaba Dünyalılar");

        // 100'den 1e kadar sınırlar dahil 8 ile bölünebilen sayıları yazdırın

        for (int i = 100; i >=1 ; i--) {
            if(i%8==0) {
                System.out.print(i+" ");
            }
        }
    }
}
