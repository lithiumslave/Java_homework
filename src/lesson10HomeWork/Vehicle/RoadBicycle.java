package lesson10HomeWork.Vehicle;

public class RoadBicycle extends Bicycle{
    private int rudderDepth;

    public RoadBicycle() {
        this.rudderDepth = 0;
    }
    public RoadBicycle(int rudderDepth, int id, int gear) {
        super(id, gear);
        this.rudderDepth = rudderDepth;
    }

    public void stop() {
        System.out.println("Road bike has stopped");
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
