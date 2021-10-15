package lesson13HomeWork.LoginProgram;

public class WrongPasswordException extends Exception {
    private String info;

    public WrongPasswordException() {
        this.info = "Incorrect password";
    }

    public WrongPasswordException(String message) {
        super(message);
        this.info = message;
    }
}