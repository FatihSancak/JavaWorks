package src.day35_InheritancedaConstructorKullanimi;

public class Child extends BParent {

    String isim = "Child isim belirtilmedi";
    protected String childKlupAdi = "Child  Klub�";

    Child() {
        System.out.println("Child constructor �al��t�");
    }

    public static void main(String[] args) {
        AGrandParent gp1 = new AGrandParent();
        // Bu objecti olu�turmak i�in Grandpa Constructor �al���r.
        // Parent veya Child Constructor �al��maz.

        Child child1 = new Child();
        child1.grandpaKlupAdi = "Child1";
        child1.parentKlupAdi = "Child2";

        // child1 object'i i�in Child constructor �al���r.
        /*
        Java'da bir class'� kullanabilmek i�in
        o class'dan object olu�turur, dolay�s�yla
        o class'�n constructor'�n� kullan�rd�k

        Java inheritiance'da parent class'lardaki
        �zellikleri kullanabilmek i�in
        o class'lar�n constructor'lar�n�
        otomatik �al��t�ran bir yap� kurmu�tur.

        �rne�in biz child class'�na
        Child class'�ndan bir obje olu�turmak istedi�imizde
        Child constructor'�n� kullan�r�z.

        Java Child(){} gord���nde
        �nce parent'in constructor'�n� �al��t�rmam laz�m der
        buradan Parent constructor'�na gider

        Parent class'�nda Parent(){} gor�nce
        once bunun parent'inin yani Grandparent constructor'�n�n
        �al��mas� gerekir der.

        Extends keyword olmayan  en son class'a kadar gider
        ve oradan ba�layarak t�m conrtructor'lar�
        a�a��ya do�ru �al��t�r�r.

         */
    }
}
