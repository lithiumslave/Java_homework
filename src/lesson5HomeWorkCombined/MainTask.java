package lesson5HomeWorkCombined;

import java.util.Scanner;

public class MainTask {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter your name: ");
        String user = scan.nextLine();

        PrintOperations.greeting(user);

        System.out.println("Enter the number: ");
        int num = scan.nextInt();

        int[] arr = ArrayOperations.arrayWithRandomNumbers(num);
        ArrayOperations.printArrayWithComaBetweenValues(arr);

        int sum = ArrayOperations.sumOfArrayValues(arr);
        System.out.println("\nSum of all array values: " + sum);

        double average = ArrayOperations.averageOfArrayValues(arr);
        System.out.println("Average of all array values: " + average);

        System.out.println("Multiplication table for the average value:");
        PrintOperations.multiplicationTable(average);

        System.out.println("Please, enter the number in range from 10 to 1000");
        int number = scan.nextInt();

        int num1 = NumbersOperations.validateNumberFromTo(number, 10, 1000);
        System.out.println("Your number is " + num1);

        /*while (number < 10 || number > 1000) {
            System.out.println("Wrong! You need to enter time in the range from 10 to 1000. Please, try again: ");
            number = scan.nextInt();
        }
        System.out.println("Your number is " + number);*/

        int reverse = NumbersOperations.reverseNumber(num1);
        System.out.println("I reverse your number, please check: " + reverse);

        int powered = NumbersOperations.numPoweredToNum(reverse, 2);
        System.out.println("Also, check reversed number raised to the power of 2: " + powered);

        System.out.println("Stairway to heaven: ");
        int rowsNum = sum / user.length();
        PrintOperations.stairs(rowsNum);
    }
}
