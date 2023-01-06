package src.JetBrains;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        /*
        Bu aşamada, girişten iki pozitif tam sayı okumanız gerekir: sıra sayısı ve her sıradaki koltuk sayısı. Bilet fiyatı aşağıdaki kurallara göre belirlenir:
        Sinema salonundaki toplam koltuk sayısı 60'tan fazla değilse, her bir biletin fiyatı 10 dolardır.
        Daha büyük bir salonda biletler sıraların ön yarısı için 10 dolar, arka yarısı için 8 dolar.
        Lütfen satır sayısının tek olabileceğini unutmayın, örneğin 9 satır.
        Bu durumda ilk yarı ilk 4 sıra, ikinci yarı ise diğer 5 sıradır.
        Koltuk sayısına bağlı olarak satılan biletlerden elde edilen karı hesaplayın ve
        sonucu aşağıdaki örneklerde gösterildiği gibi yazdırın.
        Bundan sonra programınız durmalıdır. Bu projede sıra ve koltuk sayısı 9'dan fazla olmayacaktır.
         */
        int priceNotMore60Number = 10;
        int priceFrontHalf = 10;
        int priceBackHalf = 8;
        int totalIncome;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int numberOfRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int numberOfSeats = scanner.nextInt();

        int totalNumberOfSeats = numberOfRows * numberOfSeats;

        if (totalNumberOfSeats <= 60) {
            System.out.println("Total income:");
            totalIncome = totalNumberOfSeats * priceNotMore60Number;
        } else {
            int frontHalfOfRows = numberOfRows / 2;
            int backHalfOfRows = numberOfRows - frontHalfOfRows;
            totalIncome = frontHalfOfRows * numberOfSeats * priceFrontHalf
                    + backHalfOfRows * numberOfSeats * priceBackHalf;
        }
        System.out.println("$" + totalIncome);
    }
}
