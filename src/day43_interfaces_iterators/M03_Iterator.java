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
        // liste'deki t�m elemenetleri INDEX KULLANMADAN 3 artt�r�n

        for (Integer each: liste) {
            each = each + 3;
            System.out.print(each  + " " );
        }
        System.out.println(" ");
        System.out.println(liste);

        /*
        Java index yap�s� olmayan collection'lardaki elementlere
        ula�mak veya de�i�tirmek i�in Iterator interface'ini olu�turmu�tur.

        Iterator interface oldu�undan ondan object �retmemiz m�mk�n de�ildir.
        Bunun yerine bize iterator d�nd�ren liste.iterator()
        method'unu kullan�yoruz
        */

        Iterator it1 = liste.iterator();

        System.out.println(it1.next()); // 10
        System.out.println(it1.next()); // 20
        System.out.println(it1.next()); // 30
        //System.out.println(it1.next()); // 30'dan sonra element kalmad��� i�in next () RTE verir

        /*
        Iterator'da geri d�n�� yok, ad�m ad�m sona ula�t�ktan sonra
        ba�a gelmek isterseniz yeniden bir iterator olu�turman�z gerekir
         */


        // [10, 20, 30]
        Iterator it2 = liste.iterator();
        // Yeni it2 yi kullanarak listedeki t�m elementlerini silelim

        it2.next();   // 10 elementine gel
        it2.remove(); // 10 elemetini sil

        it2.next(); // 20 elementine gel
        it2.remove(); // 20 elementini sil

        it2.next(); // 30 elementine gel
        it2.remove(); // 30 elemenetini sil.

        // iterator ile elemenetleri gezip,
        // Remove yap�nca liste kal�c� olarak de�i�ir.

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

        System.out.println("Loop sonras� liste : " + liste);

        /*
         Kodlardan da anla��laca�� gibi Iterator sayesinde;
         1. T�m collection elementlerini yazd�rma
         2. T�m collection elementlerini silme
         i�lemlerini yapabiliriz ama yeterli de�ildir.

         Bu da bizim i�in yeterli de�ildir.
         */

    }
}
