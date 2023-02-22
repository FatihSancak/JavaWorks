package src.day34_Inheritance;

public class Toyota {

    protected String marka = "Toyota";
    protected String model = "Model Belirtilmedi";
    protected String yakit = "Yakýt Belirtilmedi";

    protected void motor() {
        System.out.println("Toyota çevre dostu motorlara sahiptir.");
    }

    protected void aku() {
        System.out.println("Toyota modele göre akü kullanýr.");
    }
}
