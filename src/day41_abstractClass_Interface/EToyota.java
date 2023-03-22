package src.day41_abstractClass_Interface;

public abstract class EToyota extends DAraba{

    @Override
    protected void motor() {
        System.out.println("Toyota arabalar �evreci motor kullan�r.");
    }
    /*
    Parent class'dali standart belirleyici method'lar
    (abstract method)'lar�n tamam� child class taraf�ndan override edilmelidir.

    concrete method'lar�n override edilme mecburiyeti yoktur
    istersek override edebiliriz. �stemezsek etmeyiz.

    Asl�nda Toyota class'� da object �retece�imiz bir class de�il
    bu durumda e�er proje tasar�m� yap�yorsan�z
    Toyota class'�n� da abstract yapmam�z g�zel olur.
     */
}
