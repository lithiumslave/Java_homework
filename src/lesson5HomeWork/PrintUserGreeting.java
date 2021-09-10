package lesson5HomeWork;

import java.util.Scanner;

public class PrintUserGreeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String user = scan.nextLine();
        greeting(user);
    }

    public static void greeting(String name) {
        System.out.println("GOOOOOD MORNING, VIETNAM! " + "We have a new person here, please welcome " + name.toUpperCase() + "! Enjoy and have fun ;)");
    }
}
