package src.day38_Exceptions;

import java.util.Scanner;

public class C03_Excaptions {
    public static void main(String[] args) {
        /*
        *   Marketteki t�m �r�nleri bir array'da tuttu�umuzu varsay�n
        *   Kullan�c�ya index sorup, o index'deki �r�n� yazd�ran bir
        *   program haz�rlay�n
        *
        *   Kullan�c� �r�n say�s�ndan b�y�k bir index girerse
        *   exception vermesinin �n�ne ge�elim
        *  */

        String[] urunler = {"Nutella","�okokrem","S�t","�ay","F�nd�k"};

        Scanner scan = new Scanner(System.in);
        System.out.println("�stedi�iniz �r�n s�ra nosunu giriniz");
        int istenenSira = 0;


        try {
            istenenSira = scan.nextInt();
        } catch (Exception deneme) {
            //throw new RuntimeException(e);
            System.out.println("Say�sal bir de�er giriniz.");
            System.out.println("deneme.getMessage() = " + deneme.getMessage());
            deneme.getStackTrace();
            /*
            Catch blo�unun �n�ndeki parantezde
            exception class'�n�n ismi ve yan�nda
            yakalanan exception'� atad���m�z variable'in ismi olur (e)

            E�er yakalanan exception ile ilgili bilgileri
            kullan�c�ya vermek isterseniz
            bu object'i kullanabilirsiniz.
            */
        }

        try {
            System.out.println("Arad���n�z �r�n "+ urunler[istenenSira-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //throw new RuntimeException(e);
            System.out.println("Girdi�iniz index siras� listemizde bulunmuyor. "
                    +"\nS�ra numaras� en fazla : "+ urunler.length + " olabilir");
        }
    }
}
