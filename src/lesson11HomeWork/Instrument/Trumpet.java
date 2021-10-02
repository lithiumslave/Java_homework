package lesson11HomeWork.Instrument;

public class Trumpet implements Instrument {
    private int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Test trumpet with " + diameter + " diameter by playing in the key of " + KEY);
    }
}
