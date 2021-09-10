package lesson5HomeWorkCombined;

import java.util.Scanner;

public class NumbersOperations {
    public static Scanner scan = new Scanner(System.in);

    public static int reverseNumber(int x) {
        int reverse = 0;

        while (x != 0) {
            int remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x / 10;
        }

        return reverse;
    }

    public static int numPoweredToNum(int a, int b) {
        int power = 1;

        for (int i = 1; i <= b; i++) {
            power = power * a;
        }

        return power;
    }

    public static int validateNumberFromTo (int number, int a, int b) {
        while (number < a || number > b) {
            System.out.println("Wrong! You need to enter time in the range from " + a + " to " + b + ". Please, try again: ");
            number = scan.nextInt();
        }
        return number;
    }
}
