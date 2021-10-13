package lesson13HomeWork.CustomBankAccount;

public class LimitExceededException extends Exception{
    private int maxLim;

    LimitExceededException(String message, int maxLim) {
        super(message);
        this.maxLim = maxLim;
    }

    public int getMaxLim() {
        return maxLim;
    }
}
