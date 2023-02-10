package src.day29_passByValue_immutable;

public class C04_Immutable {
    public static void main(String[] args) {
        /*
        Immutable :  Deðiþtirilemez
        Mutable : Deðiþtirilebilir

        en bilinen immutable class : String

         */

        String str ="Yýldýz Bank";

        System.out.println(str.toUpperCase()); // YILDIZ BANK

        str.toLowerCase();

        System.out.println(str); // Yýldýz Bank (toLowerCase etkilemedi)

        str.substring(3,5); // dý olmalý ancak yazdýr komutu olmadoðýndan str kalýcý deðiþiklik yapmaz.

        /*
        Java'da String gibi metin ifadelerde kullanabileceðimiz
        mutable StringBuilder class'ý da vardýr.
         */

        StringBuilder sb=new StringBuilder("Java Bank");

        System.out.println(sb); // Java Bank

        sb.reverse();

        System.out.println(sb); // knaB avaJ

        sb.append(".");

        System.out.println(sb); // knaB avaJ.
    }
}
