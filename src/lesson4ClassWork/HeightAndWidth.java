package lesson4ClassWork;

import java.util.Scanner;

import static java.lang.System.out;

public class HeightAndWidth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        out.println("Please, enter height: ");
        int height = scan.nextInt();
        out.println("Please, enter width: ");
        int width = scan.nextInt();

        // Loop in the loop
        out.println("Result: ");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                out.printf("#");

                // Condition for the line break
                if (j == (width - 1)) {
                    out.println();
                }
            }
        }
    }
}
