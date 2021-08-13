package lesson3HomeWork;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Если не делится на 4 - обычный
        // Если делится на 100 И не делится на 400 - обычный
        // Если делится на 100 И делится на 400 - высокосный

        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter the year: ");
        int year = scan.nextInt();

        // Condition
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
            System.out.println("Year " + year + " is not a leap year");
        } else {
            System.out.println("Year " + year + " is a leap year");
        }

        // Если делится на 4 - высокосный
        // Если делится на 4 И делится на 100 И делится на 400 - высокосный
        // Если делится на 100 И не делится на 400 - обычный
        /*Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter the year: ");
        int year = scan.nextInt();

        // Condition
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Year " + year + " is a leap year");
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is not a leap year");
        }*/
    }
}
