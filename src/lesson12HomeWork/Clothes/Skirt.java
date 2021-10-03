package lesson12HomeWork.Clothes;

public class Skirt extends Clothes implements WomansClothing{

    public Skirt(Size size, int price, String color) {
        super(size, price, color);
        this.setName("Skirt");
    }

    public void dressWoman() {
        System.out.println("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
    }
}
