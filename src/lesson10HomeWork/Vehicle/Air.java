package lesson10HomeWork.Vehicle;

public interface Air {
    static void lowerAltitude() {
        System.out.println("Air vehicle is going down the altitude");
    }

    default void gainingAltitude() {
        System.out.println("Air vehicle is gaining altitude");
    }
}
