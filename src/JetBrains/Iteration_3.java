package src.JetBrains;

import java.util.Arrays;
import java.util.Scanner;

public class Iteration_3 {
    public static void main(String[] args) {
        /*
        The minimum value of an array

        Write a program that reads an array of integers and finds the minimum value of the array.

        Input data format
        The first line contains the size of an array.
        The second line contains elements of the array separated by spaces.

        Output data format
        An integer number representing the minimum in the input array.

        Samples:
        > 5
        > 5 1 4 2 3
        < 1

        > 3
        > -1 -2 -3
        < -3
         */
        System.out.println("Array Size");
        Scanner scan = new Scanner(System.in);
        int dizi = scan.nextInt();

        System.out.print("Enter the required values to create an array");
        int[] arr = new int[dizi];
        for (int i = 0; i < dizi; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
