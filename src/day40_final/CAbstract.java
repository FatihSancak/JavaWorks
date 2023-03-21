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
    Bir method'un baþýna ABSTRACT yazarsanýz
    bu method'un child class'lar için bir standart olduðunu deklare ederiz
    ve method body'sine ihtiyaç kalmaz.
     */
}
