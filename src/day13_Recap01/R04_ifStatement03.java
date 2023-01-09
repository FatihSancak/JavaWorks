package src.day13_Recap01;

import java.util.Scanner;

public class R04_ifStatement03 {
    public static void main(String[] args) {
        /*
        Print "lütfen işunvanınızı girin.
        jobTitle isimli bir değişken oluşturun ve kullnıcıdan isteyin
        Doğru jobTitle yazdırmak için test datalarını kullanının
        Example :
        Eğer jobTitle qa ise pirint Quality Analyst
        dev ise print Developer
        ba ise print Businnes Analyst
        pm ise print Project Manager
         */
        System.out.print("Job Title --> : ");
        Scanner scan = new Scanner(System.in);
        String job = scan.next().toLowerCase();

        switch (job) {
            case "qa" -> System.out.println("Quality Analyst");
            case "dev" -> System.out.println("Developer");
            case "ba" -> System.out.println("Businnes Analyst");
            case "pm" -> System.out.println("Project Manager");
            default -> System.out.println("Lütfen Giriş Yaınız");
        }

//********************* IF STATEMENT

//        if(job.equals("qa")){
//            System.out.println("Quality Analyst");
//        }else if(job.equals("dev")){
//            System.out.println("Developer");
//        }else if(job.equals("ba")){
//            System.out.println("Businnes Analyst");
//        }else if(job.equals("pm")){
//            System.out.println("Project Manager");
//        }else {
//            System.out.println("Lütfen Giriş Yaınız");
//        }
//*********************

    }
}