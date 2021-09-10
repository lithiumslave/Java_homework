package lesson5HomeWork;

import java.util.Scanner;

public class PrintMultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer value: ");
        int x = scan.nextInt();
        multiplicationTable(x);
    }

    public static void multiplicationTable(int num) {
        for (int i = 1; i <= 10; ++i) {
            System.out.println(num + "*" + i + "=" + num * i);
        }
    }
}
