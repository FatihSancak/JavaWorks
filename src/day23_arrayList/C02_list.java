package src.day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_list {
    public static void main(String[] args) {
        /*
        elimizde �r�nlerin bulundu�u bir liste var
        �r�n listesindeki istenen siradaki �r�n�
        istedi�imiz yeni �r�nle de�i�tirip
        eski �r�n�, varolan eski �r�nler listesine ekleyin.
         */
        List<String> urunler = new ArrayList<>();

        urunler.add("Nutella");
        urunler.add("�kram");
        urunler.add("�ekirdek");
        urunler.add("�ay");

        List<String> eskiUrunler = new ArrayList<>();
        // listedki ikram'�n yerine biskrem koyal�m,
        // ikram'� da eski �r�nler listesine ekleyelim

        String yeniUrun = "Biskrem";
        String silinecekUrun = "�kram";

        // int temp = urunler.indexOf(silinecekUrun); // silinecek �r�n�n index'i d�ner

        String silinenUrun = urunler.set(urunler.indexOf(silinecekUrun), yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("eskiUrunler = " + eskiUrunler);
        System.out.println("yeniUrun = " + urunler);


        yeniUrun = "Kahve";
        silinecekUrun = "�ay";

        silinenUrun = urunler.set(urunler.indexOf(silinecekUrun), yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("eskiUrunler = " + eskiUrunler);
        System.out.println("yeniUrun = " + urunler);
    }
}