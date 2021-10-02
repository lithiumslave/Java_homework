package lesson10HomeWork.Vehicle;

import lesson5HomeWorkCombined.PrintOperations;

public class Runner {
    public static void main(String[] args) {
        MountainBicycle mountBicEmpty = new MountainBicycle();
        MountainBicycle mountBic = new MountainBicycle(4, 2, 2);
        RoadBicycle roadBic = new RoadBicycle(3, 3, 6);
        Vehicle car = new Car();
        Vehicle hel1 = new Helicopter(4, 400, 200);
        Vehicle hel2 = new Helicopter(5, 600, 500);
        Vehicle hel3 = hel1;
        Vehicle hel4 = new Helicopter(4, 400, 200);

        // Homework11
        Flyable hel5 = new Helicopter(4, 200, 200);
        Flyable.canFly();
        hel5.gainingAltitude();
        hel5.lowerAltitude();

        System.out.println();

        Ground bike = new RoadBicycle();
        Ground.ride();
        bike.start();
        bike.stop();

        System.out.println();

        Ground bikeMount = new MountainBicycle();
        Rollable bikeMountSec = new MountainBicycle();

        Ground.ride();
        bikeMount.start();
        bikeMount.stop();
        bikeMountSec.hasWheels();
        bikeMountSec.wheels(2);

        // MOUNTAIN BICYCLE
        PrintOperations.printSeparator();
        mountBic.setSeatHeight(5);
        mountBic.changeGear(3);
        System.out.println("Final setup for your mountain bike:" +
                           "\nHeight of the seat: " + mountBic.getSeatHeight() +
                           "\nBicycle id: " + mountBic.getId() +
                           "\nGears: " + mountBic.getGear());
        mountBic.move();

        // ROAD BICYCLE
        PrintOperations.printSeparator();

        roadBic.setRudderDepth(4);
        roadBic.changeGear(7);
        System.out.println("Final setup for your road bike:" +
                           "\nDepth of the rudder: " + roadBic.getRudderDepth() +
                           "\nBicycle id: " + roadBic.getId() +
                           "\nGears: " + roadBic.getGear());
        roadBic.move();

        // Use speedUp() and applyBrake() for Car object and Bicycle object
        PrintOperations.printSeparator();

        mountBicEmpty.setSpeed(30);
        roadBic.setSpeed(40);
        car.setSpeed(60);

        System.out.println("Current speed of your mountain bike is " + mountBicEmpty.getSpeed() + " km/h");
        mountBicEmpty.speedUp(5);
        System.out.println("Are you a snail or smth? I've increase your speed on 5. Your new speed is " + mountBicEmpty.getSpeed() + " km/h");
        mountBicEmpty.applyBrake(25);
        System.out.println("Hm, you can kill some squirrel actually. Your new decreased speed is " + mountBicEmpty.getSpeed() + " km/h");

        System.out.println("\nCurrent speed of your road bike is " + roadBic.getSpeed() + " km/h");
        roadBic.speedUp(10);
        System.out.println("Your super duper mountain bike's speed was increased on 10. It's current speed is " + roadBic.getSpeed() + " km/h");
        roadBic.applyBrake(30);
        System.out.println("Your super duper mountain bike's speed was increased on 30. It's current speed is " + roadBic.getSpeed() + " km/h");

        System.out.println("\nCurrent speed of your car is " + car.getSpeed() + " km/h");
        car.speedUp(70);
        System.out.println("Too slow! Car speed was increased to " + car.getSpeed() + " km/h");
        car.applyBrake(40);
        System.out.println("Calm down, Lightning McQueen. Car speed was decreased to " + car.getSpeed() + " km/h");

        // hashCode() and equals() in Helicopter
        PrintOperations.printSeparator();
        System.out.println(hel1.toString());
        System.out.println(hel2.toString());
        System.out.println(hel3.toString());
        System.out.println(hel4.toString());

        System.out.println("\nHelicopters 1 and 2 are the same? " + hel1.equals(hel2));
        System.out.println("Helicopters 1 and 2 are the same? " + (hel1 == hel2));

        System.out.println("\nHelicopters 1 and 3 are the same? " + hel1.equals(hel3));
        System.out.println("Helicopters 1 and 3 are the same? " + (hel1 == hel3));

        System.out.println("\nHelicopters 1 and 4 are the same? " + hel1.equals(hel4));
        System.out.println("Helicopters 1 and 4 are the same? " + (hel1 == hel4));

        // CAR
        PrintOperations.printSeparator();

        Car.setCarType("Sedan");
        System.out.println("Your car has type: " + Car.getCarType());
        Car.setTransmission("Manual");
        System.out.println("Your car has transmission: " + Car.getTransmission());
        car.move();
    }
}
