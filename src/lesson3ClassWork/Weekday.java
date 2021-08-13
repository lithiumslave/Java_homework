package lesson3ClassWork;

import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter number from 1 to 7: ");
        int number = scan.nextInt();

        switch (number) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Wrong, bye!"); break;
        }

        /* It doesn't work, will try again after "loop" lesson
        for (int counter = 0; counter < 10; counter++) {
            System.out.println("Please, enter number from 1 to 7!");
            int number = scan.nextInt();
            if ((number < 1 || number > 7) && counter == 9) {
                System.out.println("Go drink some coffee and come back later!");
                break;
            } else if (number < 1 || number > 7) {
                System.out.println("Your input is incorrect, try again!");
                number = scan.nextInt();
            } else {
                switch (number) {
                    case 1: System.out.println("Monday"); break;
                    case 2: System.out.println("Tuesday"); break;
                    case 3: System.out.println("Wednesday"); break;
                    case 4: System.out.println("Thursday"); break;
                    case 5: System.out.println("Friday"); break;
                    case 6: System.out.println("Saturday"); break;
                    case 7: System.out.println("Sunday"); break;
                    default: System.out.println("Just smile"); break;
                }
                break;
            }
          }*/
        }
    }

