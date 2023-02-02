package src.Recap02;
public class R06_NestedTernary {
    public static void main(String[] args) {
    /*
      Final notunu tanımlayın, NestedTernary ile çözümleyin
      'A' --> "Gayet Başarılı"
      'B' --> "Başarılı"
      'C' --> "Ha Gayret"
      bu notlar dışındakileri diğerleri yazdırınız
     */
        char not ='A';

        String sonuc = not=='A'?"Gayet Başarılı":not=='B'?"Başarılı":not=='C'?"Ha gayret":"Diğerleri";
        System.out.println("sonuc = " + sonuc);
    }
}
