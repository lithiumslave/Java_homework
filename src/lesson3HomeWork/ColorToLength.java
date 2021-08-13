package lesson3HomeWork;

import java.util.Scanner;

public class ColorToLength {
    public static void main(String[] args) {
        // VARIANT 1. Switch operator
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter the color from the list - red, blue, green, yellow, orange, black, white, pink: ");
        String color = scan.nextLine();

        switch (color) {
            case "red": System.out.println("Length of your color is 3"); break;
            case "blue": System.out.println("Length of your color is 4"); break;
            case "green": System.out.println("Length of your color is 5"); break;
            case "yellow": System.out.println("Length of your color is 6"); break;
            case "orange": System.out.println("Length of your color is 6"); break;
            case "black": System.out.println("Length of your color is 5"); break;
            case "white": System.out.println("Length of your color is 5"); break;
            case "pink": System.out.println("Length of your color is 4"); break;
            default: System.out.println("I have no info about this color, check the conditions of the task!");
        }

/*      // --------------------------------------------------------------------------------------------------
        // VARIANT 2. Convert the string to a character array and count the number of elements in the array

        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter the color from the list - red, blue, green, yellow, orange, black, white, pink: ");
        String color = scan.nextLine();

        // 1. Convert string to char array
        char[] ch = color.toCharArray();

        // 2. Use length property of array to display length of string or Iterate through the char array to count the length.
        // Nichego ne ponyatno, no ochen` interesno
        int i = 0;
        for(char c: ch) {
            i++;
        }
        System.out.println("Length of your color is " + i);*/

/*      // --------------------------------------------------------------------------------------------------
        //VARIANT 3. Use .length()
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter the color from the list - red, blue, green, yellow, orange, black, white, pink: ");
        String color = scan.nextLine();

        int length = color.length();
        System.out.println("Length of your color is " + length);*/
    }
}

