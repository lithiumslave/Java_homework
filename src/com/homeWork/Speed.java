package com.homeWork;

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        // 1 hour = 60 minutes = 3600 seconds
        // 1 kilometer = 1000 meters
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, input distance in meters: ");
        float meters = scan.nextFloat();
        float kilometers = meters / 1000;
        System.out.println("Please, input hours: ");
        int hours = scan.nextInt();
        System.out.println("Please, input minutes: ");
        int minutes = scan.nextInt();
        System.out.println("Please, input seconds: ");
        int seconds = scan.nextInt();

        float globalSeconds = hours*3600 + minutes*60 + seconds;
        float globalHours = (globalSeconds) / 3600;
        float speed1 = (float) (meters / globalSeconds);
        float speed2 = (float) (kilometers / globalHours);

        System.out.println("Your speed in meters/second is " + speed1);
        System.out.println("Your speed in km/h is " + speed2);


        /*float meters = 2500;
        float kilometers = meters / 1000;
        int hours = 5;
        int minutes = 56;
        int seconds = 23;

        float globalSeconds = hours*3600 + minutes*60 + seconds;
        float globalHours = (globalSeconds) / 3600;
        float speed1 = (float) (meters / globalSeconds);
        float speed2 = (float) (kilometers / globalHours);

        System.out.println("Your speed in meters/second is " + speed1);
        System.out.println("Your speed in km/h is " + speed2);*/
    }
}
