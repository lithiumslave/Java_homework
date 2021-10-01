package lesson10HomeWork.Vehicle;

public class RoadBicycle extends Bicycle{
    private int rudderDepth;

    public RoadBicycle() {}
    public RoadBicycle(int rudderDepth, int id, int gear) {
        super(id, gear);
        this.rudderDepth = rudderDepth;
    }

    public int getRudderDepth() {
        return rudderDepth;
    }

    public void setRudderDepth(int rudderDepth) {
        this.rudderDepth = rudderDepth;
    }

    @Override
    public int changeGear(int value) {
        return this.gear = value;
    }
}
