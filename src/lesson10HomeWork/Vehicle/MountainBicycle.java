package lesson10HomeWork.Vehicle;

public class MountainBicycle extends Bicycle implements Rollable{
    private int seatHeight;

    public MountainBicycle() {
        this.seatHeight = 0;
    }

    public MountainBicycle(int seatHeight, int id, int gear) {
        super(id, gear);
        this.seatHeight = seatHeight;
    }

    public void stop() {
        System.out.println("Mountain bike has stopped");
    }

    public void start() {
        System.out.println("Mountain bike start moving");
    }

    public void hasWheels() {
        System.out.println("Your vehicle has wheels");
    }

    public int changeGear(int value) {
        return this.gear = value;
    }

    public int getSeatHeight() {
        return seatHeight;
    }
    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }
}
