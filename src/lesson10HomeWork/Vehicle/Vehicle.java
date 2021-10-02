package lesson10HomeWork.Vehicle;

public abstract class Vehicle {
    int speed;
    private String model;

    public Vehicle() {}

    public Vehicle(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    public int speedUp(int newIncreasedSpeed) {
        return this.speed = newIncreasedSpeed;
    }

    public int applyBrake(int newDecreasedSpeed) {
        return this.speed = newDecreasedSpeed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract void move();

    /*final void stop() {
        System.out.println(this.model + " has stopped");
    }*/

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
