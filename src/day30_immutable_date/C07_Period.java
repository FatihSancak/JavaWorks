package src.day30_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {
        // iki tarih arasýndaki süreyi bulma
        LocalDate tarih1 = LocalDate.of(1977,3,18);
        LocalDate bugun = LocalDate.now();

        Period yas = Period.between(tarih1,bugun);

        System.out.println(yas);
    }
}
