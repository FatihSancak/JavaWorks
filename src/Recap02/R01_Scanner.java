package src.Recap02;

public class R01_Scanner {
    public static void main(String[] args) {
        /*
        Kullanıcıdan
        a, b, c sayılarını okuyarak aşağıdaki işlemleri yapan bşr kod yazınız.
        a'nın karesinden b'nin karesini çıkarıp c'nin 3 katına bölünüz
        örnek
        inputs -> a: 5, b:3 c:1
        output -> sonuc : 5,333333
         */

        double a = 4;
        double b = 6;
        double c = 2;

        double sonuc = ((a*a)-(b*b))/(3*1);

        System.out.println("sonuc = " + sonuc);
    }
}
