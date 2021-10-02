package lesson11HomeWork.Instrument;

public class RockMain {
    public static void main(String[] args) {
        Guitar fender = new Guitar(6);
        Guitar gibson = new Guitar(8);
        Drum drum = new Drum("Middle");
        Drum drum1 = new Drum("Big");
        Drum drum2 = new Drum("Small");
        Trumpet trump = new Trumpet(10);

        Instrument[] instruments = {fender, gibson, drum, drum1, drum2, trump};

        for (Instrument tools: instruments) {
            tools.play();
        }
    }
}
