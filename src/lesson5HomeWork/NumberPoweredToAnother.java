package lesson5HomeWork;

import java.util.Scanner;

public class NumberPoweredToAnother {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();

        System.out.println("The value of " + num1 + " raised to the power of " + num2 + " is " + numPoweredToNum(num1, num2));
    }

    public static int numPoweredToNum(int a, int b) {
        int power = 1;
        for (int i = 1; i <= b; i++) {
            power = power * a;
        }
        return power;
    }
}
