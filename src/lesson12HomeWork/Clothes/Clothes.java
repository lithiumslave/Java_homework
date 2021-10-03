package lesson12HomeWork.Clothes;

public abstract class Clothes {
    private String name;
    private Size size;
    private int price;
    private String color;

    public Clothes(Size size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }


    public void selectedSizeInfo() {
        System.out.println("Size " + size + " (Euro size: " + size.getEuroSize() + "), " + size.getDescription());
    }


    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
