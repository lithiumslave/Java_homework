package lesson6ClassWork;

import java.util.Scanner;

public class ReplaceDigitsToChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String random = scan.nextLine();
        System.out.println(replaceDigitsWithStars(random));
    }

    public static String replaceDigitsWithStars(String random) {
        // return random.replaceAll("[0-9]", "*");
        // return random.replaceAll("\\d", "*");

        String reversed = "";
        for (int i = 0; i < random.length(); i++) {
            char c = random.charAt(i);

            if (Character.isDigit(random.charAt(i))) {
                reversed += "*";
            } else {
                reversed += random.charAt(i);
            }
        }
        return reversed;
    }
}
