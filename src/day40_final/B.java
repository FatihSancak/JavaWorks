package src.day40_final;

final public class B extends A {
    public static void main(String[] args) {
        /*
        Bir class FINAL olarak belirlenirse
        o class inherit edilemez.
         */
        B obj = new B();
        obj.isim = "Arkýn";
        System.out.println(A.OKUL);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }

}
