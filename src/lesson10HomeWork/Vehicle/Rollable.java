package lesson10HomeWork.Vehicle;

public interface Rollable {
    void hasWheels();

    default void wheels(int wheel) {
        System.out.println("Your vehicle with " + wheel + " wheels can roll");
    }
}
