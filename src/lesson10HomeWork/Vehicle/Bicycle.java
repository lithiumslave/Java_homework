package lesson10HomeWork.Vehicle;

public abstract class Bicycle extends Vehicle implements Ground{
    public final int id;
    protected int gear;

    public Bicycle() {
        this.id = 0;
        this.gear = 0;
    }

    public Bicycle(int id, int gear) {
        this.id = id;
        this.gear = gear;
    }

    public void stop() {
        System.out.println("Bicycle has stopped");
    }

    public int speedUp(int valueIncrease) {
        return this.speed = speed + valueIncrease;
    }

    public int applyBrake(int valueDecrease) {
        return this.speed = speed - valueDecrease;
    }

    public void move(){
        System.out.println("Bicycle with id №" + this.id + " and gear " + this.gear + " is moving");
    }

    abstract int changeGear(int value);

    public int getId() {
        return id;
    }

    public int getGear() {
        return gear;
    }
}
