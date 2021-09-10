package lesson5HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class RandomValuesArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter qty of elements in the array: ");
        int n = scan.nextInt();

        System.out.println(Arrays.toString(arrayWithRandomNumbers(n)));
    }

    public static int[] arrayWithRandomNumbers(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20) + 1;;
        }
        return array;
    }
}
