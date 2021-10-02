package lesson10HomeWork.Vehicle;

public interface Flyable {

    static void canFly() {
        System.out.println("Air vehicle is flyable");
    }

    default void lowerAltitude() {
        System.out.println("Air vehicle is going down the altitude");
    }

    default void gainingAltitude() {
        System.out.println("Air vehicle is gaining altitude");
    }
}
