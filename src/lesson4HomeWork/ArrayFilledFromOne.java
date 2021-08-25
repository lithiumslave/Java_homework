package lesson4HomeWork;

import java.util.Scanner;

public class ArrayFilledFromOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Print number of array cells
        System.out.println("Enter qty of elements in the array: ");
        int n = scan.nextInt();

        // Declare the array with n cells
        int array[] = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
    }
}
