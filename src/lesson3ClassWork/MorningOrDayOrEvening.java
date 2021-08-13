package lesson3ClassWork;

import java.util.Scanner;

public class MorningOrDayOrEvening {
    public static void main(String[] args) {
        // Good evening: time > 18
        // Good morning: time < 10
        // Good day: otherwise

        Scanner bebra = new Scanner(System.in);

        System.out.println("Please, enter time of day: ");
        int time = bebra.nextInt();

        // Validation
        while (time < 0 || time > 24) {
            System.out.println("Please, enter time in the range of 0-24 hours!");
            time = bebra.nextInt();
        }

        // Condition
        if (time > 18) {
            System.out.println("Good evening!");
        } else if (time < 10) {
            System.out.println("Good morning!");
        } else {
            System.out.println("Good day!");
        }
    }
}
