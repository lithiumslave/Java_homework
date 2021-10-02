package lesson10HomeWork.Vehicle;

public interface Ground {
    void stop();

    static void ride() {
        System.out.println("The vehicle is moving on the ground");
    };
}
