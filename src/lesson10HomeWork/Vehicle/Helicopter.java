package lesson10HomeWork.Vehicle;

import java.util.Objects;

public class Helicopter extends Vehicle implements Air{
    int amountOfPassengers, maxHeight, tankSize;

    public Helicopter(int amountOfPassengers, int maxHeight, int tankSize) {
        this.amountOfPassengers = amountOfPassengers;
        this.maxHeight = maxHeight;
        this.tankSize = tankSize;
    }

    @Override
    public void gainingAltitude() {
        Air.super.gainingAltitude();
    }

    public void move() {
        System.out.println("Helicopter is flying");
    }

    @Override
    public String toString() {
        return "Helicopter {" +
                "amountOfPassengers = " + amountOfPassengers +
                ", maxHeight = " + maxHeight +
                ", tankSize = " + tankSize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Helicopter that = (Helicopter) o;
        return amountOfPassengers == that.amountOfPassengers && maxHeight == that.maxHeight && tankSize == that.tankSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfPassengers, maxHeight, tankSize);
    }
}
