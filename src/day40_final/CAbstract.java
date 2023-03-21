package src.day40_final;

public abstract class CAbstract {
    void toplam() {
        System.out.println("Bu method toplama yapar");
    }

    abstract void carpma();

    abstract void bolme();

    void cikarma(){
        System.out.println("Bu method toplama yapar");
    }
    /*
    Bir method'un ba��na ABSTRACT yazarsan�z
    bu method'un child class'lar i�in bir standart oldu�unu deklare ederiz
    ve method body'sine ihtiya� kalmaz.
     */
}
