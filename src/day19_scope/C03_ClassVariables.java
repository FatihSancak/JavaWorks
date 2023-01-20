package src.day19_scope;

public class C03_ClassVariables {

    public static void main(String[] args) {

        /*
        Farklı bir class'da çalışırken
        her hangi bir class adınız yazıp .'ya basarsak
        adını yazdığımız class'daki tüm STATIC class üyeleri görülebilir
        ve kullanabiliriz.
         */

        C02_StaticVariables.staticMethod(); //
        System.out.println(C02_StaticVariables.staticSay);
        System.out.println(C02_StaticVariables.degersizStaticVar);

        /*
        class variable'lara değer atayıp atamamak bize kalmıştır.
        istersek değer ataması yaparız, istemezsek değer atamayız.
        Eğer değer atamışsak Java atadığımız o değeri kabul eder.
        değer atamazsak Java bu variable'lara default bir değer ataması yapar.

        int --> 0
        String --> null
        boolean --> false
        char --> '' hiçlik
        */

        /*
        başka class'daki intance variable'lara object oluşturarak ulaşabiliriz.
         */

        C02_StaticVariables obje1 = new C02_StaticVariables();
        obje1.staticOlmayanMethod(); // 10
        // staticOlmayanMethod() içinde staticSay = 20; olarak sayının değeri de güncellenmişti.

        System.out.println("obje1.degersizInstanceVariable = " + obje1.degersizInstanceVariable); // Mehmet
        System.out.println("obje1.isim = " + obje1.isim); // 0

        System.out.println("C02_StaticVariables.staticSay = " + C02_StaticVariables.staticSay);
        /*
        Farklı bir class'dan C02 class'ından method ve variable'ları kullandığımda
        C02 class'înın tamamı değil sadece çağrılan class uyeleri çalışır.
         */
    }
}