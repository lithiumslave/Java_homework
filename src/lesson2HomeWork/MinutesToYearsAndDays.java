package lesson2HomeWork;

import java.util.Scanner;

public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        // 1 day = 24 hours = 1440 minutes
        // 1 year = 365 days = 8760 hours = 525600 minutes

        // Declaration of constants
        final int minsInHour = 60;
        final int minsInDay = minsInHour * 24;
        final int minsInYear = minsInDay * 365;

        // Input minutes from the console
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter minutes: ");
        int minutes = scan.nextInt(); // user can enter only integer value
        int years = minutes / minsInYear;
        int days = minutes % minsInYear / minsInDay;

        // Output years and days in the console
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

        /* VARIATION 2 (variable declaration with given data)
        int minutes = 3456789;
        int years = minutes / 525600;
        int days = (minutes % 525600) / 1440;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");*/
    }
}
