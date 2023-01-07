package src.day11_stringManipulations;

public class C03_contains {
    public static void main(String[] args) {
        /*
        Kullanicidan email adresini girmesini isteyin,
        mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”,
        @gmail.com ile bitiyorsa “Email adresiniz kaydedildi “ ,
        @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */
        String email ="fsancak@gmail.com";

        if(!email.contains("@gmail.com")){
            System.out.println("Lütfen gmail adresi giriniz");
        }else if(email.lastIndexOf("@gmail.com")==(email.length()-10)){
            System.out.println("E-mail adresiniz kaydedildi.");
        }else{
            System.out.println("Lütfen yazımı  kontrol ediniz");
        }
    }
}
