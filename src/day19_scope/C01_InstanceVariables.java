package src.day19_scope;

public class C01_InstanceVariables{
    /*
    class level'daki variable'lar için iki SCOPE vardır.
    1. static variable'lar (class variable'ları da denir)
    2. intance (static olmayan) variables (object variable'ları da denir)
*/
    int instSayi=20; // static olmayıp class level da olduğu için instance variable'dir.

    public static void main(String[] args) {
        /*
         System.out.println(instSayi);

         instance variables static olmadığı için static kulübe üye main method'dan direk kullanamayız
         instance variabale'ların diğer adı OBJECT variable'dir.
         dolayısıyla Object oluşturursaız instance variable'ları her yerden kullanabilirsiniz.

         */
        C01_InstanceVariables obje1 = new C01_InstanceVariables();
        System.out.println("obje1 değişmeden önce : "+obje1.instSayi); // 20
        obje1.instSayi = 30;
        System.out.println("obje1 değiştikten sorna : "+obje1.instSayi); // 30

        C01_InstanceVariables obje2 = new C01_InstanceVariables();
        System.out.println("obje2 değişmeden önce : "+obje2.instSayi); // 20
        obje2.instSayi = 25;
        System.out.println("obje2 değiştikten sorna : "+obje2.instSayi); // 25


        C01_InstanceVariables obje3 = new C01_InstanceVariables();
        System.out.println("obje2 değişmeden önce : "+obje3.instSayi); // 20


        staticMethod();
        /*
        her object oluştuğunda instance (object variable'larının ilk atanan değerini alır.)
        */

    }
    public static void staticMethod(){
        C01_InstanceVariables obje3 = new C01_InstanceVariables();
        System.out.println("obje2 değişmeden önce : "+obje3.instSayi); // 20

    }
    public void staticOlmayanMethod(){

        System.out.println("instSayi = " + instSayi);
    }
}
