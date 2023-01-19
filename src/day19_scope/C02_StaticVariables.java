package src.day19_scope;

public class C02_StaticVariables {

    static int staticSay=10;
    String isim="Mehmet";

    static int degersizStaticVar;
    int degersizInstanceVariable;

    /*
    class leveldeki variable'lara değer atamasak da Java kabul ediyor.
     */

    public static void main(String[] args) {
        /*
        bir variable static oluşturulduysa
        object'ler için değil class için gecerlidir.
         */
        System.out.println("staticSay = " + staticSay); // 10
        staticMethod();

        staticSay = 12;
        System.out.println("staticSay = " + staticSay); // 12

        C02_StaticVariables obje1 = new C02_StaticVariables();
        obje1.staticOlmayanMethod();
        System.out.println("staticSay = " + staticSay); // 20
        /*
        intance bir variable'ın değerini bulmak için object'in
        oluşturulmasından itibaren istenen satıra kadar kodu takip etmeliyiz.

        Static variable'da ise class'ın en başından başlayarak
        istenen satıra kadar kodu takip edip
        static variable'ın son değerini bulmamız gerekir.
         */
    }
    public static void staticMethod(){
        System.out.println("static method'dan gelen static Sayi = " + staticSay);
    }
    public void staticOlmayanMethod(){
        System.out.println("static olmayan Sayi = " + staticSay);
        staticSay=20;
    }
}
