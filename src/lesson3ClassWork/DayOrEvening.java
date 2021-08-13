package lesson3ClassWork;

import java.util.Scanner;

public class DayOrEvening {
    public static void main(String[] args) {
        // Good evening > 18
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

        // Force me to enter time twice, idk how to solve:
       /* for (int counter = 0; counter < 10; counter++) {
            System.out.println("Please, enter time in the range of 0-24 hours!");
            time = scan.nextInt();
            if ((time < 0 || time > 24) && counter == 9) {
                System.out.println("You are drunk. Drink some coffee and come back later ;)");
                return;
            } else if (time < 0 || time > 24) {
                System.out.println("Your input is incorrect, try again!");
            } else {
                break;
            }
        }*/

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
