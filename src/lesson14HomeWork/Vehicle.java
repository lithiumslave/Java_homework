package lesson14HomeWork;

import java.util.Objects;

public class Vehicle {
    private String brand;
    private String color;
    private int plateNumber;

    public Vehicle(String brand, String color, int plateNumber) {
        this.brand = brand;
        this.color = color;
        this.plateNumber = plateNumber;
    }


    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getPlateNumber() {
        return plateNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return getPlateNumber() == vehicle.getPlateNumber() && Objects.equals(getColor(), vehicle.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getPlateNumber());
    }
}
