package lesson11HomeWork.Instrument;

public class Guitar implements Instrument {
    private int numberOfStrings;

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Test guitar with " + numberOfStrings + " strings by playing in the key of " + KEY);
    }
}
