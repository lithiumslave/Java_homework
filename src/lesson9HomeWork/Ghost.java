package lesson9HomeWork;

import java.util.Random;

public class Ghost {
    private String color;

    public Ghost() {
        Random rand = new Random();

        switch (rand.nextInt(4)) {
            case (0): color = "White"; break;
            case (1): color = "Yellow"; break;
            case (2): color = "Purple"; break;
            case (3): color = "Red"; break;
        }
    }

    public String getColor() {
        return color;
    }
}
