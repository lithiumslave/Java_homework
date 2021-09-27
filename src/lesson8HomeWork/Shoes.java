package lesson8HomeWork;

public class Shoes {
    private String brand;
    private int size;
    private int price;

    private static int qtyProduct = 0;

    public Shoes() {
        brand = "Puma";
        price = 95;
        size = 45;
        qtyProduct++;
    }

    public Shoes(String brand, int size, int price) {
        this.brand = brand;
        this.price = price;
        this.size = size;
        qtyProduct++;
    }

    public Shoes(String brand, int price) {
        this.brand = brand;
        this.price = price;
        qtyProduct++;
    }

    public static int getQtyProduct() {
        return qtyProduct;
    }

    @Override
    public String toString() {
        return "Shoes {" +
                "brand = '" + brand + '\'' +
                ", size = " + size +
                ", price = " + price +
                '}';
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
