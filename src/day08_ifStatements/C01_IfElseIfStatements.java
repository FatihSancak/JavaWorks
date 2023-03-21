package src.day08_ifStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {
        /*
        Kullanıcıdan gün ismini yazmasını isteyin.
        Girilen isim geçerli bir gün ise gün isminin 1., 2. ve 3. harflerini
        ilk harf büyük diğer ikisi küçük olarak yazdırın,
        gün ismi geçerli ise geçerli değilse geçerli bir gün ismi yazdırın
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir gün ismi giriniz :  ");
        String gun = scan.next().toLowerCase();

        if (gun.equals("pazartesi") || gun.equals("Pazar")){
            System.out.println("Paz");
        }else if (gun.equals("salı")){
            System.out.println("Sal");
        }else if (gun.equals("çarşamba")){
            System.out.println("Çar");
        }else if (gun.equals("perşembe")){
            System.out.println("Per");
        }else if (gun.equals("cumartesi") || gun.equals("cuma")){
            System.out.println("Cum");
        }else{
            System.out.println("Geçerli bir gün giriniz");
        }
    }
}
