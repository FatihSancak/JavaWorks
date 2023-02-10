package src.day29_passByValue_immutable;

public class C04_Immutable {
    public static void main(String[] args) {
        /*
        Immutable :  De�i�tirilemez
        Mutable : De�i�tirilebilir

        en bilinen immutable class : String

         */

        String str ="Y�ld�z Bank";

        System.out.println(str.toUpperCase()); // YILDIZ BANK

        str.toLowerCase();

        System.out.println(str); // Y�ld�z Bank (toLowerCase etkilemedi)

        str.substring(3,5); // d� olmal� ancak yazd�r komutu olmado��ndan str kal�c� de�i�iklik yapmaz.

        /*
        Java'da String gibi metin ifadelerde kullanabilece�imiz
        mutable StringBuilder class'� da vard�r.
         */

        StringBuilder sb=new StringBuilder("Java Bank");

        System.out.println(sb); // Java Bank

        sb.reverse();

        System.out.println(sb); // knaB avaJ

        sb.append(".");

        System.out.println(sb); // knaB avaJ.
    }
}
