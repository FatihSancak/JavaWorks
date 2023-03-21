package src.day38_exceptions;

public class C02_Exceptiions {
    public static void main(String[] args) {
        int a = 1000;
        int b = 50;
        int sayac = 1;

        while (sayac < 1000) {
/*
* Try/Catch blo�u yapmaya �al���t���m�z ama risk oldu�unu d���nd���m�z
*   i�lemleri yazmak i�in kullan�l�r.
* Catch'den sonraki parantez kar��la�may� bekledi�imiz exception
*   t�r�n� Java'ya s�ylemek i�in kullan�l�r.
* Catch Blo�u: Java'ya s�yledi�imiz exception (istisnai durum) ger�ekle�irse
*   Java'n�n yapmas�n� istedi�imiz i�lemi bar�nd�r�r.
* Catch Blo�unun �n�ndeki paranteze kar��la�may� bekledi�imiz
*   Exception'� yazabilir ya da her t�rl� exception'da devreye girmesini istiyorsak
*   t�m exception'lar�n parent'i olan Exception yazabiliriz.
*
* */
            try {
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("Payda 0 oldu. Dikkatli olun.");
            }
            b--;
            sayac++;
        }
    }
}
