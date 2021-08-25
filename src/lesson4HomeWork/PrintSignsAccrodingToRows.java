package lesson4HomeWork;

import java.util.Scanner;

public class PrintSignsAccrodingToRows {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String rows = "";

        // Validation for zero, empty, negative values
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the number of rows: ");
            rows = scan.nextLine();

            if ((rows.isEmpty() || Integer.parseInt(rows) < 0 || Integer.parseInt(rows) == 0) && i == 4){
                System.out.println("Failed! You've used all the attempts, try again later.");
                return;
            } else if (rows.isEmpty()) {
                System.out.println("Failed! Empty number.");
            } else if (Integer.parseInt(rows) < 0) {
                System.out.println("Failed! Negative number of rows.");
            } else if (Integer.parseInt(rows) == 0) {
                System.out.println("Failed! Zero number of rows.");
            } else {
                break;
            }
        }

        // Print triangle of # symbols (first row is "##")
        for (int j = 0; j < Integer.parseInt(rows); j++) {
            for (int h = 0; h <= j; h++) {
                // Condition for the first row ("##")
                if (h == 0){
                    System.out.print("##");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
