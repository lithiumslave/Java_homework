package lesson12HomeWork.Clothes;

public class Tie extends Clothes implements MensClothing{

    public Tie(Size size, int price, String color) {
        super(size, price, color);
        this.setName("Tie");
    }

    public void dressMan() {
        System.out.println("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
    }
}
