package src.day11_stringManipulations;

public class C04_contains {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cumle isteyin.
        Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
        “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
         */

        String cumle ="Java büyük dünya küçk.";
        if(cumle.contains("büyük") && cumle.contains("küçük")){
            System.out.println("Hem küçük hem de BÜYÜK harf kullanılmış karar vermelisiniz: Hangisini seçelim");
        }else if (cumle.contains("küçük")){
            System.out.println(cumle.toLowerCase());
        }else if (cumle.contains("büyük")){
            System.out.println(cumle.toUpperCase());
        }else{
            System.out.println("Cümle küçük yada büyük kelimesi içermiyor");
        }
    }
}
