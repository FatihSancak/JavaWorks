package src.day35_inheritancedaConstructorKullanimi;

public class KDizelCorolla extends HCorolla {
    KDizelCorolla() {
        // super(); gizli oldu�undan yaz�lmaz ama �al���r.
        System.out.println("KDizelCorolla parametresiz cons");
    }

    KDizelCorolla(String isim) {
        super(isim);
        System.out.println("KDizelCorolla parametreli cons");
    }

    public static void main(String[] args) {
        KDizelCorolla obj1 = new KDizelCorolla("2023");
    }
}
