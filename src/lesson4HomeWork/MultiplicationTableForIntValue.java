package lesson4HomeWork;

import java.util.Scanner;

import static java.lang.System.out;

public class MultiplicationTableForIntValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numb = 0;

        // Validation for negative values
        for (int i = 0; i < 10; i++) {
            out.println("Please, enter a positive integer value: ");
            numb = scan.nextInt();
            if ( numb < 0 && i == 9) {
                System.out.println("FAILED! Go drink some coffee and come back later.");
                return;
            } else if (numb < 0) {
                System.out.println("Incorrect, try again!");
            } else {
                break;
            }
        }

        // Multiplication Table
        for (int j = 1; j <= 10; ++j) {
            System.out.println(numb + "*" + j + "=" + numb * j);
        }
    }
}
