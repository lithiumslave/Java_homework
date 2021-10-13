package lesson13HomeWork;

public class NullVariable {
    public static void main(String[] args) {
        String empty = null;

        try {
            empty.toString();
        } catch (NullPointerException e) {
            System.out.print("Here you have NullPointerException");
        }
    }

}
