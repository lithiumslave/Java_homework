package lesson14HomeWork;

public class Car extends Vehicle {
    private int doorsNumber;
    private String carType;

    public Car(String brand, String color, int plateNumber, int doorsNumber, String carType) {
        super(brand, color, plateNumber);
        this.doorsNumber = doorsNumber;
        this.carType = carType;
    }

    public String getCarType() {
        return carType;
    }
}
