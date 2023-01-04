package src.day07_ifStatements;

public class C01_AndOperatorleri {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;

        System.out.println(a>0 && b<20 && c>b);
        System.out.println(a<0 && b<20 && c>b);
        /*
        Java & operatörü konusunda bize iki seçenek sunar;
        1 - && kullanılırsa ilk flase bulduğunda artık sonucun  false olacağını bilir
        ve gereiye kalan şartları incelemez

        2 - & kullanırsak tüm şartları kontrol eder sonra sonucu belirler.
        bu çalışma usulünden dolayı & operatörü, && operatörüne göre daha yavaş olabilir.
         */
        System.out.println(a<0 & b<20 & c>b);
    }
}
