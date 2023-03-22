package src.day41_abstractClass_Interface;

public abstract class EToyota extends DAraba{

    @Override
    protected void motor() {
        System.out.println("Toyota arabalar çevreci motor kullanýr.");
    }
    /*
    Parent class'dali standart belirleyici method'lar
    (abstract method)'larýn tamamý child class tarafýndan override edilmelidir.

    concrete method'larýn override edilme mecburiyeti yoktur
    istersek override edebiliriz. Ýstemezsek etmeyiz.

    Aslýnda Toyota class'ý da object üreteceðimiz bir class deðil
    bu durumda eðer proje tasarýmý yapýyorsanýz
    Toyota class'ýný da abstract yapmamýz güzel olur.
     */
}
