package lesson4HomeWork;

import java.util.Scanner;

public class NumberPowered {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();

        int power = 1;

        for (int i = 1; i <= num2; i++) {
            power = power * num1;
        }
        System.out.println("The value of " + num1 + " raised to the power of " + num2 + " is " + power);
    }
}
