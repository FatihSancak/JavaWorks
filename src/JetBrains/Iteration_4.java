package src.JetBrains;

import java.util.Scanner;

public class Iteration_4 {
    public static void main(String[] args) {
        /*
        A right rotation is an operation that shifts each element of an array to the right.
        For example, if an array is {1,2,3,4,5} and we right rotate it by 1, the new array will be {5,1,2,3,4}.
        If we rotate it by 2, the new array will be {4,5,1,2,3}.
        It goes like this: {1,2,3,4,5} -> {5,1,2,3,4} -> {4,5,1,2,3}.

        Implement rotate method that performs a right rotation on an array by a given number.
        Note that If your solution gets the code quality warning "System.arraycopy is more efficient",
        please simply ignore it for this code challenge.
         */

        // implement me
        private static void rotate(int[] arr, int steps) {

        }

        }

        // do not change code below
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int steps = Integer.parseInt(scanner.nextLine());

            rotate(arr, steps);

            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    }
