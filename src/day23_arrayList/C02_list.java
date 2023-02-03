package src.day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_list {
    public static void main(String[] args) {
        /*
        elimizde ürünlerin bulunduðu bir liste var
        ürün listesindeki istenen siradaki ürünü
        istediðimiz yeni ürünle deðiþtirip
        eski ürünü, varolan eski ürünler listesine ekleyin.
         */
        List<String> urunler = new ArrayList<>();

        urunler.add("Nutella");
        urunler.add("Ýkram");
        urunler.add("Çekirdek");
        urunler.add("Çay");

        List<String> eskiUrunler = new ArrayList<>();
        // listedki ikram'ýn yerine biskrem koyalým,
        // ikram'ý da eski ürünler listesine ekleyelim

        String yeniUrun = "Biskrem";
        String silinecekUrun = "Ýkram";

        // int temp = urunler.indexOf(silinecekUrun); // silinecek ürünün index'i döner

        String silinenUrun = urunler.set(urunler.indexOf(silinecekUrun), yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("eskiUrunler = " + eskiUrunler);
        System.out.println("yeniUrun = " + urunler);


        yeniUrun = "Kahve";
        silinecekUrun = "Çay";

        silinenUrun = urunler.set(urunler.indexOf(silinecekUrun), yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("eskiUrunler = " + eskiUrunler);
        System.out.println("yeniUrun = " + urunler);
    }
}