package lesson3ClassWork;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        // Validation:
        // Name length > 0
        // Password > minPassLength

        Scanner scan = new Scanner(System.in);

        // Password and Name conditions
        final int minNameLength = 1;
        final int minPassLength = 5;

        // Input credentials
        System.out.println("Enter your Name: ");
        String name = scan.nextLine();
        System.out.println("Enter your Password: ");
        String pass = scan.nextLine();

        // Declare length of the Name and Password
        int nameLength = name.length();
        int passLength = pass.length();

        //Errors
        if ((passLength < minPassLength) && (nameLength < minNameLength)){
            System.out.println("ERROR! Your name is empty and password is less than 5 chars!");
        } else if (passLength < minPassLength) {
            System.out.println("ERROR! Your password length is less than 5 chars!");
        } else if (nameLength < minNameLength) {
            System.out.println("ERROR! Your name is empty!");
        } else {
            System.out.println("Congrats! You are logged in!");
        }

        /*// My own validation: Name const, Pass > 5 and const.

        Scanner scan = new Scanner(System.in);

        // Declare the login conditions
        final String nameTrue = "Kate";
        final String passTrue = "qwerty";
        final int minPassLength = 5;

        // Input credentials
        System.out.println("Enter your Name: ");
        String name = scan.nextLine();
        System.out.println("Enter your Password: ");
        String pass = scan.nextLine();

        // Declare length of the password
        int passLength = pass.length();

        // Errors
        if (passLength < minPassLength) {
            System.out.println("ERROR! Incorrect length of the password!");
        } else if ((!name.equals(nameTrue)) && (!pass.equals(passTrue))){
            System.out.println("ERROR! Wrong Name and Password!");
        } else if (!name.equals(nameTrue)) {
            System.out.println("ERROR! Wrong Name!");
        } else if (!pass.equals(passTrue)) {
            System.out.println("ERROR! Wrong Password!");
        } else {
            System.out.println("Congrats! You are logged in!");
        }*/
    }
}
