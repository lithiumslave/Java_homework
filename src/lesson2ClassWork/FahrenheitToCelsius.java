package lesson2ClassWork;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        // tC = (tF - 32) x 5/9

        Scanner scan = new Scanner(System.in);

        System.out.println("Input the temperature in Fahrenheit: ");
        float fahr = scan.nextFloat();
        float celsius = (fahr - 32) * 5 / 9;

        System.out.println("Temperature in Celsius is: " + celsius);
    }
}
