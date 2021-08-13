package lesson3ClassWork;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        // If string is more than 10 chars - ERROR

        Scanner scan = new Scanner(System.in);

        // Declare the maximum length
        final int maxLength = 10;

        // Input string
        System.out.println("Please, enter the word: ");
        String word = scan.nextLine();

        // Declare length of the word
        int stringLength = word.length();

        // Condition "Ternary'
        String result = (stringLength > maxLength) ? "ERROR! Wrong length of the word!" : "Great job, the length of your word is " + stringLength;
        System.out.println(result);

        // Condition "if...else"
       /* if (stringLength > max) {
            System.out.println("ERROR! Wrong length of the word!");
        } else {
            System.out.println("Great job, the length of your word is " + stringLength);
        }*/
    }
}
