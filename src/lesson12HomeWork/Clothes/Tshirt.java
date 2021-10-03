package lesson12HomeWork.Clothes;

public class Tshirt extends Clothes implements MensClothing, WomansClothing {

    public Tshirt(Size size, int price, String color) {
        super(size, price, color);
        this.setName("T-shirt");
    }

    public void dressMan() {
        System.out.println("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
    }
    public void dressWoman() {
        System.out.println("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
    }
}
