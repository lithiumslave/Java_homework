package lesson13HomeWork.MyCustomException;

public class UserLazinessException extends Exception {
    private int minDistance;

    UserLazinessException(String message, int minDistance) {
        super(message);
        this.minDistance = minDistance;
    }

    public int getMinDistance() {
        return minDistance;
    }
}
