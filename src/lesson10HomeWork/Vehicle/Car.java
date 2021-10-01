package lesson10HomeWork.Vehicle;

import lesson10HomeWork.Animal.Cat;

public class Car extends Vehicle{
    static String carType;
    static String transmission;

    public static void setCarType(String carType) {
        Car.carType = carType;
    }

    public void move() {
        System.out.println("This " + carType + " with " + transmission + " transmission is moving");
    }

    public static void setTransmission(String transmission) {
        Car.transmission = transmission;
    }

    public static String getCarType() {
        return carType;
    }

    public static String getTransmission() {
        return transmission;
    }
}
