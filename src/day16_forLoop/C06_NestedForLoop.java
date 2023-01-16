package src.day16_forLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*
        Bazen tek değişiken sorunu çözmeye yetmez.
        Örneğin kullanıcıdan aldığınız 5 sayısı ile aşağıdaki
        çıktının elde edilmesi gibi:

        *
        * *
        * * *
        * * * *
        * * * * *

        bu tür durumlar da iç içe (NESTED) loop kullanmak gerekir.


         */
        int sayi =5;

        // birinci FOR LOOP döngüsü
        for (int i = 1; i <= sayi ; i++)
        {
            // ikinci FOR LOOP döngüsü
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
