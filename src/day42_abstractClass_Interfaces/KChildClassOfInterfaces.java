package src.day42_abstractClass_Interfaces;

public class KChildClassOfInterfaces implements I02_Interfaces, I03_Interfaces {
    /*
    Bir class'� bir interface ile child yapmak i�in IMPLEMENTS keywordu kullan�l�r.
    Implements yazd�ktan sonra virg�l kullanarak istedi�imiz kadar interface ekleyebilirsiniz.
     */
    public static void main(String[] args) {
        System.out.println(I03_Interfaces.SAYI); // 20
        System.out.println(I02_Interfaces.SAYI); // 30
        System.out.println(ISIM); // SANCAK KOLEJ�
    }

    @Override
    public void yakit() {

    }

    @Override
    public void motor() {

    }

    @Override
    public void teker() {

    }
}
