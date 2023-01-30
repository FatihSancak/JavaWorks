package src.day21_Arrays;

public class C02_EnUzunVeKisaKelime {
    public static void main(String[] args) {
        // Verilen String bir array’de en zuun ve en kısa String’leri yazdıran bir method oluşturun

        String[] isimler={"Erdal","Onur","Mehmet","Hayrullah","Mihrican"};

        enUzunVeKisayiYadir(isimler);

    }

    public static void enUzunVeKisayiYadir(String[] isimler) {
        String enUzunKelime = isimler[0];
        String enKisaKelime = isimler[0];

        for (int i = 1; i < isimler.length; i++) {
            if (isimler[i].length() > enUzunKelime.length()){
                enUzunKelime = isimler[i];
            }
            if (isimler[i].length() < enKisaKelime.length()){
                enKisaKelime = isimler[i];
            }
        }
        System.out.println("Dizideki En Kisa Kelime = " + enKisaKelime);
        System.out.println("Dizideki En Uzun Kelime = " + enUzunKelime);
    }
}
