package src.day35_InheritancedaConstructorKullanimi;

public class Child extends BParent {

    String isim = "Child isim belirtilmedi";
    protected String childKlupAdi = "Child  Klubü";

    Child() {
        System.out.println("Child constructor çalýþtý");
    }

    public static void main(String[] args) {
        AGrandParent gp1 = new AGrandParent();
        // Bu objecti oluþturmak için Grandpa Constructor çalýþýr.
        // Parent veya Child Constructor çalýþmaz.

        Child child1 = new Child();
        child1.grandpaKlupAdi = "Child1";
        child1.parentKlupAdi = "Child2";

        // child1 object'i için Child constructor çalýþýr.
        /*
        Java'da bir class'ý kullanabilmek için
        o class'dan object oluþturur, dolayýsýyla
        o class'ýn constructor'ýný kullanýrdýk

        Java inheritiance'da parent class'lardaki
        özellikleri kullanabilmek için
        o class'larýn constructor'larýný
        otomatik çalýþtýran bir yapý kurmuþtur.

        Örneðin biz child class'ýna
        Child class'ýndan bir obje oluþturmak istediðimizde
        Child constructor'ýný kullanýrýz.

        Java Child(){} gordüðünde
        önce parent'in constructor'ýný çalýþtýrmam lazým der
        buradan Parent constructor'ýna gider

        Parent class'ýnda Parent(){} gorünce
        once bunun parent'inin yani Grandparent constructor'ýnýn
        çalýþmasý gerekir der.

        Extends keyword olmayan  en son class'a kadar gider
        ve oradan baþlayarak tüm conrtructor'larý
        aþaðýya doðru çalýþtýrýr.

         */
    }
}
