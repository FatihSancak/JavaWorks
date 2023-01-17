package src.day17_nestedForLoop;

public class C10 {
    public static void main(String[] args) {
        boolean dogruMu = false;
        int sayi = 10;

        while (!dogruMu){
            if(sayi>20){
                System.out.println("OK");
                dogruMu=true;
            }else{
                System.out.println("Şart sağlanmadı..."+ sayi);
                sayi++;
            }
        }
    }
}