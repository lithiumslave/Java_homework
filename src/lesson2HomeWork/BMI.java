package lesson2HomeWork;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // bmi = weight (lbs) / [height (in)]2 x 703;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please, input weight in pounds: ");
        int pounds = scan.nextInt();
        System.out.println("Please, input height in inches: ");
        int inches = scan.nextInt();
        double mbi = pounds / Math.pow(inches, 2) * 703;

        System.out.println("Body Mass Index is: " + mbi);


        // HOLA< COMMENT FOR THE COMMIT
        /*int pounds = 452;
        int inches = 72;
        double mbi = pounds / Math.pow(inches, 2) * 703;
        System.out.println("Body Mass Index is: " + mbi);*/
    }
}
