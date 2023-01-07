package src.JetBrains;
import java.util.Scanner;

public class Iteration_2 {
    public static void main(String[] args) {
        /*
        Write a program that reads an array of ints and an integer number n. The program must sum all the array elements greater than n.
        Input data format

        The first line contains the size of an array.
        The second line contains the elements of the array separated by spaces.
        The third line contains the number n.

        Output data format
        Only a single number representing the sum.

        Samples :
        -> 5
        -> 5 8 11 2 10
        -> 8
        <- 21

        -> 4
        -> -5 -4 -6 -11
        -> -10
        <- -15
         */

        System.out.println("Array Size");
        Scanner scan = new Scanner(System.in);
        int dizi = scan.nextInt();

        System.out.print("Enter the required values to create an array");
        int[] arr = new int[dizi];
        for (int i = 0; i < dizi; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("You must enter a criterion for the total : ");
        int n = scan.nextInt();

        int toplam = 0;
        for(int i = 0;i<dizi;i++){
            if(arr[i]>n){
                toplam += arr[i];
            }
        }
        System.out.println(toplam);
    }
}
