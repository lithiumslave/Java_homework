package lesson5HomeWork;

import java.util.Scanner;

public class PrintStairsPattern {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rowsNum = scan.nextInt();
        printStairs(rowsNum);
        // printStars(getValidatedString());
    }

    private static void printStairs(int rows) {
        for (int j = 0; j < rows; j++) {
            for (int h = 0; h <= j; h++) {
                if (h == 0){
                    System.out.print("##");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    /*private static void printStars (String rows) {
        for (int j = 0; j < Integer.parseInt(rows); j++) {
            for (int h = 0; h <= j; h++) {
                if (h == 0){
                    System.out.print("##");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
    private static String getValidatedString() {
        String rows = "";
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the number of rows: ");
            rows = scan.nextLine();

            if ((rows.isEmpty() || Integer.parseInt(rows) < 0 || Integer.parseInt(rows) == 0) && i == 4){
                System.out.println("Failed! You've used all the attempts, try again later.");
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
        return rows;
    }*/
}
