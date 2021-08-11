package lesson3ClassWork;

import java.util.Scanner;

public class DayOrEvening {
    public static void main(String[] args) {
        // Good evening >18
        // Otherwise Good day
        // Use IF and Ternary

        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter time of day: ");
        int time = scan.nextInt();

        // validation until user will enter 0-24 time
        while (time < 0 || time > 24) {
            System.out.println("Please, enter time in the range of 0-24 hours!");
            time = scan.nextInt();
        }
        /*if (time = 17; time < 0 || time > 24; time++) {
            System.out.println("Please, enter time in the range of 0-24 hours!")
            };*/

        // Hello condition (Ternary)
        String result = (time > 18) ? "Good evening!" : "Good day!";
        System.out.println(result);

        /* Hello condition (if else)
        if (time > 18) {
            System.out.println("Good evening!");
        } else {
            System.out.println("Good day!");
        }*/
        }
}
