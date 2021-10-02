package lesson10HomeWork.Vehicle;

public interface Ground {
    void stop();
    void start();

    static void ride() {
        System.out.println("This is vehicle and it can move on the ground");
    };
}
