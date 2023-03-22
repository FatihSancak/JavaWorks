package src.day41_abstractClass_Interface;

public abstract class DAraba {
    public static void main(String[] args) {
        /*
        abstract class'da main method opsiyoneldir.
        E�er abstract class sadece child class'lar�n ta��mak
        sorunda oldu�u �zellikleri belirlemek i�in
        olu�turulduysa main method'a ihtiya� olmaz
        sadece abstract method'lar olur

        ama bir acbstract meth�d'da standart belirlemek
        d���nda da method'lar �al��abilir
        bu durumda ihtiya� olursa main method olu�turulabilir.
         */
    }
    protected abstract void yakit();
    protected abstract void kaporta();
    protected abstract void motor();
        /*
        SAdece child class'lar�n mecburi ta��yacaklar�
        �zellikleri belirleyen method'lar abstract method olur ve

        abstract method'lar�n body'si olmaz.
         */
    public void klima(){
        System.out.println("Baz� arabalada klima olabilir");

        /*
        abstract olmayan method'lar CONCRETE method denir.
        abstract bir nethod'u abstract keyword ile belirtmek ZORUNLUDUR
        concrete method'larda bunun deklara edilmesine gerek yoktur
        biz sadece abstraction ile ilgili konu�tu�umuzda
        abstract olmayan method'lardan bahsetmek i�in concrete tabirini kullan�r�z.
         */
    }
}
