package com.homeWork;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        // S = (a * b * sinA) / 2
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter the triangle side A: ");
        int sideA = scan.nextInt();
        System.out.println("Please, enter the triangle side B: ");
        int sideB = scan.nextInt();
        System.out.println("Please, enter Angle between A and B in degrees Celsius: ");
        int degrees = scan.nextInt();

        // make radians from degrees
        double radians = Math.toRadians(degrees);
        double area = sideA * sideB / 2d * Math.sin(radians);
        System.out.println("The area of triangle is: " + area);
    }
}
