package lesson4HomeWork;

import java.util.Scanner;

public class ReversedDigitsWithSpaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter the integer number, so I could reverse it and show for you: ");
        int num = scan.nextInt();

       /* int num = 54321;*/
        int reverse = 0;

        while (num != 0) {
            int remainder = num % 10;
            System.out.print(remainder + " ");
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }

    }
}
