package lesson3HomeWork;

import java.util.Scanner;

public class NumberToMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter the number from 1 to 12: ");
        int number = scan.nextInt();

        switch (number) {
            case 1: System.out.println("It's Winter season! Do you kno that in the 4th of January in 1972 — Willy Wonka's trademark was registered."); break;
            case 2: System.out.println("It's Winter season! February is the end of the Winter, so you need to drink a lot of tea and be prepared for the Spring season :)"); break;
            case 3: System.out.println("It's Spring season! In March large amount of poop comes out from the freeze"); break;
            case 4: System.out.println("It's Spring season! So here's a joke for you:\n - What's the best thing about Switzerland?\n - I don't know, but the flag is a big plus."); break;
            case 5: System.out.println("It's Spring season! May is a pretty good month for US presidents.\nEvery other month of the year, at least one US president has died, but never in May!"); break;
            case 6: System.out.println("It's Summer season! June is derived from Juno, the goddess of marriage."); break;
            case 7: System.out.println("It's Summer season! July is named after Roman dictator Julius Caesar"); break;
            case 8: System.out.println("It's Summer season! Do you know that in the 3rd of August there is a National Watermelon Day?"); break;
            case 9: System.out.println("It's an Autumn season! Wake Me Up When September Ends"); break;
            case 10: System.out.println("It's an Autumn season! Do you know that a great Java programmer named Vitaliy Malyarenko was born on the 11 of October"); break;
            case 11: System.out.println("It's an Autumn season! Nothing special"); break;
            case 12: System.out.println("It's Winter season! Happy New Year!"); break;
            default: System.out.println("Hello! I said to enter from 1 to 12. Bye bye, dear!"); break;
        }
    }
}
