package com.classWork;

import java.util.Scanner;

public class AverageForSquaredNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input number 1: ");
        double first = scan.nextDouble();
        System.out.println("Input number 2: ");
        double second = scan.nextDouble();
        System.out.println("Input number 3: ");
        double third = scan.nextDouble();

        double average = (Math.pow(first, 2) + Math.pow(second, 2) + Math.pow(third, 2)) / 3;
        System.out.println("Your average is " + average);
    }
}
