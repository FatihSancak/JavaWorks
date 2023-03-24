package src.day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste); // [10, 20, 30]
        // liste'deki tüm elemenetleri INDEX KULLANMADAN 3 arttýrýn

        for (Integer each: liste) {
            each = each + 3;
            System.out.print(each  + " " );
        }
        System.out.println(" ");
        System.out.println(liste);

        /*
        Java index yapýsý olmayan collection'lardaki elementlere
        ulaþmak veya deðiþtirmek için Iterator interface'ini oluþturmuþtur.

        Iterator interface olduðundan ondan object üretmemiz mümkün deðildir.
        Bunun yerine bize iterator döndüren liste.iterator()
        method'unu kullanýyoruz
        */

        Iterator it1 = liste.iterator();

        System.out.println(it1.next()); // 10
        System.out.println(it1.next()); // 20
        System.out.println(it1.next()); // 30
        //System.out.println(it1.next()); // 30'dan sonra element kalmadýðý için next () RTE verir

        /*
        Iterator'da geri dönüþ yok, adým adým sona ulaþtýktan sonra
        baþa gelmek isterseniz yeniden bir iterator oluþturmanýz gerekir
         */


        // [10, 20, 30]
        Iterator it2 = liste.iterator();
        // Yeni it2 yi kullanarak listedeki tüm elementlerini silelim

        it2.next();   // 10 elementine gel
        it2.remove(); // 10 elemetini sil

        it2.next(); // 20 elementine gel
        it2.remove(); // 20 elementini sil

        it2.next(); // 30 elementine gel
        it2.remove(); // 30 elemenetini sil.

        // iterator ile elemenetleri gezip,
        // Remove yapýnca liste kalýcý olarak deðiþir.

        System.out.println(liste); // []

        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("Yeniden liste : " + liste);

        Iterator it3 = liste.iterator();

        while (it3.hasNext()){
            it3.next();
            it3.remove();
        }

        System.out.println("Loop sonrasý liste : " + liste);

        /*
         Kodlardan da anlaþýlacaðý gibi Iterator sayesinde;
         1. Tüm collection elementlerini yazdýrma
         2. Tüm collection elementlerini silme
         iþlemlerini yapabiliriz ama yeterli deðildir.

         Bu da bizim için yeterli deðildir.
         */

    }
}
