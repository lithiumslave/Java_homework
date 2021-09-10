package lesson4HomeWork;

import java.util.Scanner;

public class ArrayAverageValue {
    public static void main(String[] args) {

        int array[] = { 1, 2, 3, 5, 6, 7, 11, 13, 19 };
        double sum = 0;

        for (int i : array) {
            sum = sum + i;
        }

        double average = sum / array.length;

        System.out.println("Average of our array is : " + average);
    }

        /*Scanner scan = new Scanner(System.in);

        // Print number of array cells
        System.out.println("How many elements of array will be in your array?");
        int n = scan.nextInt();

        // Declare the array with n cells
        int array[] = new int[n];
        double sum = 0;

        // Enter n cells values
        for(int i = 0; i < array.length; i++) {
            System.out.print("Enter element № " + (i + 1) + ": ");
            array[i] = scan.nextInt();
        }

        // Find sum of all n values
        for (int i : array) {
            sum = sum + i;
        }

        // Find the average value of n cells values
        double average = sum / array.length;

        System.out.println("Average of our array is: " + average);
    }*/
}
