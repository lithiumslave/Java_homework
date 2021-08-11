package lesson2ClassWork;

import java.util.Scanner;

public class CelsiusToKelvin {
    public static void main(String[] args) {
        // Kelvin = tC + 273.16
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, input temperature in Celsius: ");
        float celsius = scan.nextFloat();
        float kelvin = celsius + 273.16f;

        System.out.println("Temperature in Kelvin is: " + kelvin);
    }
}
