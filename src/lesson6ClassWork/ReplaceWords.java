package lesson6ClassWork;

import java.util.Scanner;

public class ReplaceWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inp = scan.nextLine();

        System.out.println(reverse(inp));
    }

    public static String reverse(String inputString) {
        String[] words = inputString.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]).append(" ");
        }

        return reversedString.toString();
    }
}
