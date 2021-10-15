package lesson13HomeWork.LoginProgram;

public class WrongLoginException extends Exception {
    private String info;

    public WrongLoginException() {
        this.info = "Incorrect login";
    }

    public WrongLoginException(String message) {
        super(message);
        this.info = message;
    }
}
