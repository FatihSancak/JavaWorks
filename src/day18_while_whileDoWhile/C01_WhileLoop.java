package src.day18_while_whileDoWhile;

public class C01_WhileLoop {
    public static void main(String[] args) {
  /*
  Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden
  baslayip bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin.
  Kullanicinin hata yapmadigini farz edin
   */
        char ilkHarf = 'F';
        char sonHarf = 't';
        char temp= ilkHarf;
        String buyut="";

        while(temp<=sonHarf){
            buyut = temp +""; // CHAR'ın yanına bir HİÇ ifadesi eklenerek variable  STRING'e donusturduk.
            System.out.print(buyut.toUpperCase()+" ");
            temp++;
        }
    }
 }