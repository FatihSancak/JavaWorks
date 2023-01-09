package src.day14_Recap02;
public class R02_Scanner {
    public static void main(String[] args) {
        /*
        Bir işçinin işi bitirme süresi ve toplam işçi sayısını alarak,
        işin bitme süresini hesaplayan kodu yazınız
        örneğin: bir işçi bir işi 10 günde yapabilmektedir.
        Buna ögre iki işçi aynı işi kaç günde yapar

        Ekran Çıktısı:
        bir işçi işi kaç günde bitirmektedir. : 10
        toplam kaç işçi çalışmaktadır : 2
        işin toplam süresi 5 gündür
         */

        double isHacmi = 100;
        double toplamIsci = 35;
        double toplamSure;
        
        toplamSure = isHacmi/toplamIsci;
        System.out.println("toplamSure = " + toplamSure);
        
    }
}
