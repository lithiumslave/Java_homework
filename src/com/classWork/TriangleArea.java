package com.classWork;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        // Example
        // Input: base = 3; height = 2;
        // Result: Area = 3
        // Area = (Base x Height)/2;

        Scanner lol = new Scanner(System.in);

        System.out.println("Enter the base leg of the triangle: ");
        double base = lol.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        double height = lol.nextDouble();

        double area = (base * height) / 2;
        System.out.println("Area of Triangle = " + area);
    }
}
