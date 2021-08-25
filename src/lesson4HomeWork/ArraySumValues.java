package lesson4HomeWork;

import java.util.Scanner;

public class ArraySumValues {
    public static void main(String[] args) {
        // 1 + 2 + 3 + 5 + 6 + 7 + 11 + 13 + 19 = 67 esli sho

        int array[] = { 1, 2, 3, 5, 6, 7, 11, 13, 19 };
        int sum = 0;

        for (int i : array) {
            sum = sum + i;
        }

        System.out.println("The sum of all array values is " + sum);
    }

    Scanner scan = new Scanner(System.in);

}
