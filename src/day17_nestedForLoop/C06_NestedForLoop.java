package src.day17_nestedForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen String'i aşağıdaki gibi yazdıran bir kod program yazınız

        input ="Deniz"
        output :

        D
        D e
        D e n
        D e n i
        D e n i z

         */
        String input ="Ankara";

        for (int i = 1; i <= input.length() ; i++) {
            for (int j = 1; j <=i ; j++) {
                //System.out.print(j-1+","+j+"..");
                System.out.print(input.substring(j-1,j)+"\t");// ilk harf için substring(0,1) olmalı
            }
            System.out.println();
        }
// sorunun tersi
       // input ="Adasna";
        //System.out.println();
        for (int i = 1 ; i <=input.length()  ; i++) {
            //System.out.println(i-1);
            for (int j=i; j<=input.length() ; j++) {
               //System.out.print("("+(j-1)+","+j+")-");
              System.out.print(input.substring(j-1,j)+"\t");
            }
            System.out.println();
        }
        System.out.println("************************");
        System.out.println("Yazıyı bu seferde tersten azaltarak yazalım");
        for (int i = 1 ; i <=input.length()  ; i++) {
            //System.out.println(i-1);
            for (int j=input.length(); j>=i ; j--) {
                //System.out.print("("+(j-1)+","+j+")-");
                System.out.print(input.substring(j-1,j)+"\t");
            }
            System.out.println();
        }
    }
}