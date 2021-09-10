package lesson5HomeWork;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer number: ");
        int num = scan.nextInt();
        System.out.println(reverseInt(num));
    }

    public static int reverseInt (int x) {
        int reverse = 0;

        while (x != 0) {
            int remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x / 10;
        }
        return reverse;
    }
}
