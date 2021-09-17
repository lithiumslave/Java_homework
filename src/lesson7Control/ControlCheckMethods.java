package lesson7Control;

import lesson5HomeWorkCombined.ArrayOperations;

import java.util.Scanner;

public class ControlCheckMethods {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myArray = {2, 5, 17, 4, 18, 22, 3, 55, 98};
        ArrayOperations.printArrayWithComaBetweenValues(ControlMethods.arrWithEvenOnly(myArray));

        System.out.println("\nEnter number: ");
        int numA = scan.nextInt();
        System.out.println(ControlMethods.armstrongCheck(numA));

        System.out.println("Enter number for FizzBuzz: ");
        int numB = scan.nextInt();
        System.out.println(ControlMethods.FizzBuzz(numB));

        System.out.println("Enter string: ");
        String lol = scan.nextLine();
        System.out.println(ControlMethods.reverseString(lol));
    }
}
