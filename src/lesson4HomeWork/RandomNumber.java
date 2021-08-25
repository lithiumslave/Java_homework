package lesson4HomeWork;

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner cannon = new Scanner(System.in);

        int number = (int) (Math.random() * 10) + 1;
        // int number = 15;
        int guess = 0;

        do {
            System.out.println("Guess what the number is?");
            guess = cannon.nextInt();

            if (guess < number) {
                System.out.println("Too low, try again.");
            } else if (guess > number){
                System.out.println("Too high, try again.");
            } else {
                System.out.println("You are damn right, bye ;)");
            }
        } while (guess != number);

    }
}
