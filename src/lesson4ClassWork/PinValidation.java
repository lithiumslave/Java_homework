package lesson4ClassWork;

import java.util.Scanner;

public class PinValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Declare correct pin
        final int correctPin = 1111;

        int pin = 0;

        for (int counter = 0; counter < 3; counter++) {
            System.out.println("Please, enter your pin: ");
            pin = scan.nextInt();
            if ((pin != correctPin) && counter == 2) {
                System.out.println("Sorry but you have been locked out");
                return;
            } else if (pin != correctPin) {
                System.out.println("Incorrect, try again!");
            } else {
                System.out.println("Correct, welcome back!");
                break;
            }
        }

    }
}
