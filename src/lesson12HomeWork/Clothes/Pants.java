package lesson12HomeWork.Clothes;

public class Pants extends Clothes implements MensClothing, WomansClothing{

    public Pants(Size size, int price, String color) {
        super(size, price, color);
        this.setName("Pants");
    }

    public void dressMan() {
        System.out.println("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
    }
    public void dressWoman() {
        System.out.println("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
    }
}
