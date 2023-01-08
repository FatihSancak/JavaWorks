package src.day11_stringManipulations;

public class C06_endsWith {
    public static void main(String[] args) {
        /*
        Kullanicidan email adresini girmesini isteyin,
        mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”,
        @gmail.com ile bitiyorsa “Email adresiniz kaydedildi “ ,
        @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */
        String input ="fatih@gmail.com ";

        if(!input.contains("@gmail.com")){
            System.out.println("Lütfen gmail adresinizi giriniz");
        }else if(input.endsWith("@gmail.com")){
            System.out.println("Mailiniz kaydedilmiştir.");
        }else {
            System.out.println("geçerli bir gmail giriniz.");
        }
    }
}
