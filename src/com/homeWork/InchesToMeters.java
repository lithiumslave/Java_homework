package com.homeWork;

import java.util.Scanner;

public class InchesToMeters {

    public static void main(String[] args) {
        // VARIATION 1 (input from the keyboard)
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter inches: ");
        double inch = scan.nextDouble(); // I use "double", so user can enter not only integer value
        double meter = 0.0254 * inch;
        System.out.println(inch + " inches is " + meter + " meters");

        /* VARIATION 2 (variable declaration with given data)
        int inch = 1000;
        double meter = 0.0254 * inch;
        System.out.println(inch + " inches is " + meter + " meters");*/
    }
}
