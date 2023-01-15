package src.day15_overloading_for_loop;

public class C05_ForLoop {
    // 1'den 5'e kadar (5 dahil) olan tam sayıları toplama
    public static void main(String[] args) {
        int toplam=0;
        for (int i = 1; i <=5 ; i++) {
            toplam+=i;
        }
        System.out.println("toplam = " + toplam);

        // 10 dahil 20 dahil aradaki sayıları toplayın
        toplam = 0;
        for (int i = 10; i<=20 ; i++) {

            toplam+=i;
        }
        System.out.println("10-20 arası sayıların toplamı = " + toplam);
        
        // 30 dahil 50 dahil aradaki çift sayıları toplayın
        toplam=0;
        for (int i = 30; i <=50 ; i+=2) {
            toplam+=i;                        
        }
        System.out.println("30-50 arası ÇİFT sayıların toplamı = " + toplam);

        toplam=0;
        for (int i = 30; i <=50 ; i++) {
            if (i%2==0){
                toplam+=i;
            }
        }
        System.out.println("2. yöntem IF kullanarak toplam = " + toplam);

        // 1500 ile 1600 (sınırlar dahil) aradındaki 7 ile bölünebilen sayıların toplamı
        toplam=0;
        for (int i = 1500; i <=1600 ; i++) {
            if(i%7==0){
                toplam +=i;
            }
        }
        System.out.println("1500-1600 arası 7 ile bölünebilen sayıların toplamı=" + toplam);
    }
}