package lesson10HomeWork.Vehicle;

public class MountainBicycle extends Bicycle{
    private int seatHeight;

    public MountainBicycle() {
        this.seatHeight = 0;
    }

    public MountainBicycle(int seatHeight, int id, int gear) {
        super(id, gear);
        this.seatHeight = seatHeight;
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
