package src.day13_Recap01;

public class R08_BMI {
    public static void main(String[] args) {
        /*
        Kullanıcıdan kilosunu ve boyunu alın.
        Vücut Kitle İndeksi hesaplayan bir program yazın
        ipucu:
        Vücut Kitle İndexi (VKI)= Ağırlık (kg) / Boy (m) uzunluğunun KARESİ

        Örnek:
        input -> kilo : 71, Boy : 1,72
        Output -> VKI : 23
         */

        double kilo = 85;
        double boy = 1.80;

        System.out.println("VKI : " +(int)(kilo/(boy*boy)));
    }
}









