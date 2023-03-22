package src.day41_abstractClass_Interface;

public abstract class DAraba {
    public static void main(String[] args) {
        /*
        abstract class'da main method opsiyoneldir.
        Eðer abstract class sadece child class'larýn taþýmak
        sorunda olduðu özellikleri belirlemek için
        oluþturulduysa main method'a ihtiyaç olmaz
        sadece abstract method'lar olur

        ama bir acbstract methýd'da standart belirlemek
        dýþýnda da method'lar çalýþabilir
        bu durumda ihtiyaç olursa main method oluþturulabilir.
         */
    }
    protected abstract void yakit();
    protected abstract void kaporta();
    protected abstract void motor();
        /*
        SAdece child class'larýn mecburi taþýyacaklarý
        özellikleri belirleyen method'lar abstract method olur ve

        abstract method'larýn body'si olmaz.
         */
    public void klima(){
        System.out.println("Bazý arabalada klima olabilir");

        /*
        abstract olmayan method'lar CONCRETE method denir.
        abstract bir nethod'u abstract keyword ile belirtmek ZORUNLUDUR
        concrete method'larda bunun deklara edilmesine gerek yoktur
        biz sadece abstraction ile ilgili konuþtuðumuzda
        abstract olmayan method'lardan bahsetmek için concrete tabirini kullanýrýz.
         */
    }
}
