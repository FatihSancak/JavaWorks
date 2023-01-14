package src.day15_overloading_for_loop;

public class C02_Overloading {
    public static void main(String[] args) {
        /*
        Java'da oluşturduunuz method'ların isminin yaptığı işlev ile uyumlu olmasını isteris
        mesela bir String'in bir bölümünü almak için JAVA
        2 adet subString() metgod'u veya
        verilen stringdeki bazı parçaları yenileri ile değiştirmek için
        2 adet replace() method'u var.

        Java aynı isimde birden fazla method varsa hangisinin kullanılanacağına
        parametre sayısıs ve parametrelerin data türüne göre karar verir.
         */
        String str ="Bu Java öğrenilecek başka yolu yok";

        str.substring(2);
        str.substring(3,5);

        str.replace('a','v');
        str.replace("a","z");


    }
}
