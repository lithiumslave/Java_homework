package lesson13HomeWork.MyCustomException;

public class UserHealthcareException extends Exception {
    private int maxDistance;

    UserHealthcareException(String message, int maxDistance) {
        super(message);
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }
}
