package src.day20_Arrays;

import java.util.Arrays;

public class C04_ElemanlariYazdirma {
    public static void main(String[] args) {

        int sayilar[] = {1,2,3,4,5,6,7};

        // Array'in tamamını yazdıralması
        System.out.println(Arrays.toString(sayilar));

        // Array'in tüm ELEMENTLERİNİ yazdırılması
        for (int i = 0; i < sayilar.length; i++) {

                System.out.print(sayilar[i]+" ");
        }
    }
}
