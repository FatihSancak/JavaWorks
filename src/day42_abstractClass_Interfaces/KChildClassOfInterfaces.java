package src.day42_abstractClass_Interfaces;

public class KChildClassOfInterfaces implements I02_Interfaces, I03_Interfaces {
    /*
    Bir class'ý bir interface ile child yapmak için IMPLEMENTS keywordu kullanýlýr.
    Implements yazdýktan sonra virgül kullanarak istediðimiz kadar interface ekleyebilirsiniz.
     */
    public static void main(String[] args) {
        System.out.println(I03_Interfaces.SAYI); // 20
        System.out.println(I02_Interfaces.SAYI); // 30
        System.out.println(ISIM); // SANCAK KOLEJÝ
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
