package lesson11HomeWork.Instrument;

public class Drum implements Instrument {
    private String size;


    public Drum(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Test drum with " + size + " size by playing in the key of " + KEY);
    }
}
