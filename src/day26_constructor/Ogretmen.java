package src.day26_constructor;

public class Ogretmen {
    String isim ="�sim belirtilmedi";
    String soyisim = "Soyisim belirtilmedi";
    String dogumTarihi = "Tarih girilmedi";
    String brans = "Bran� belirtilmedi";
    String yanBrans = "Yan bran� belirtilmedi";

    public Ogretmen() {
    }

    public Ogretmen(String isim, String soyisim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }

    public Ogretmen(String isim, String soyisim, String dogumTarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return "Ogretmen bilgileri" +
                "\n �sim : " + isim +
                "\n Soy isim : " + soyisim +
                "\n Dogum Tarihi : " + dogumTarihi +
                "\n Bran� : " + brans +
                "\n Yan Bran�� : " + yanBrans ;
    }
}
