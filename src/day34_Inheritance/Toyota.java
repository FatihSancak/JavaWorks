package src.day34_Inheritance;

public class Toyota {

    protected String marka = "Toyota";
    protected String model = "Model Belirtilmedi";
    protected String yakit = "Yak�t Belirtilmedi";

    protected void motor() {
        System.out.println("Toyota �evre dostu motorlara sahiptir.");
    }

    protected void aku() {
        System.out.println("Toyota modele g�re ak� kullan�r.");
    }
}
