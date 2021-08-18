package lesson4ClassWork;

import java.util.Scanner;

import static java.lang.System.out;

public class HeightAndWidth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter height: ");
        int m = scan.nextInt();
        System.out.println("Please, enter width: ");
        int n = scan.nextInt();

        // Loop in the loop
        out.println("Result: ");
        for (int height = 0; height < m; height++) {
            for (int width = 0; width < n; width++) {
                System.out.printf("#");

                // Condition for the line break
                if (width == (n - 1)) {
                    System.out.println();
                }
            }
        }
    }
}
