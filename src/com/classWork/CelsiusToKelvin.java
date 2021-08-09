package com.classWork;

import java.util.Scanner;

public class CelsiusToKelvin {
    public static void main(String[] args) {
        // Kelvin = tC + 273.16
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, input temperature in Celsius: ");
        float celsius = scan.nextFloat();
        float kelvin = (float) (celsius + 273.16);

        System.out.println("Temperature in Kelvin is: " + kelvin);
    }
}
