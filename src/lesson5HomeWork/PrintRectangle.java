package lesson5HomeWork;

import java.util.Scanner;

public class PrintRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = 5, width = 7;
        rectanglePrint(height, width);
    }

    public static void rectanglePrint(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
                if (j == (b - 1)) {
                    System.out.println();
                }
            }
        }
    }
}
