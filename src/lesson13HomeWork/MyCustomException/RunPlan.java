package lesson13HomeWork.MyCustomException;

import lesson5HomeWorkCombined.PrintOperations;

import java.util.Objects;

public class RunPlan {
    private String typeOfBody;
    private int minDistance, maxDistance;

    public RunPlan(String typeOfBody) {
        this.typeOfBody = typeOfBody;
        setMinMaxDistance();
    }

    public void setMinMaxDistance() {
        if (typeOfBody.equals("Thin")) {
            this.minDistance = 5;
            this.maxDistance = 10;
        } else if (typeOfBody.equals("Fat")) {
            this.minDistance = 6;
            this.maxDistance = 12;
        } else {
            System.out.println("Unknown type of body!");
        }
    }

    public void run(int distance) {
       try {
           if (distance < getMinDistance()) {
               System.out.println("You are lazy, you have covered too little distance!");
               throw new UserLazinessException("Min distance for your type of body is: ", getMinDistance());
           } else if (distance > getMaxDistance()) {
               System.out.println("Slow down, you have covered too much distance, it is dangerous for you");
               throw new UserHealthcareException("Max distance for your type of body is: ", getMaxDistance());
           } else {
               System.out.println("You have a " + getTypeOfBody() + " type of body!");
               System.out.println("You covered " + distance + " km. Great job!");
               PrintOperations.printSeparator();
           }
       } catch (UserLazinessException e) {
           System.out.println(e.getMessage() + e.getMinDistance());
           PrintOperations.printSeparator();
           // e.printStackTrace();
       } catch (UserHealthcareException e) {
           System.out.println(e.getMessage() + e.getMaxDistance());
           PrintOperations.printSeparator();
           // e.printStackTrace();
       }
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public int getMinDistance() {
        return minDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }
}
