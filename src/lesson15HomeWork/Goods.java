package lesson15HomeWork;

public enum Goods {
    PHONE("Phone", 20000.50),
    TV("TV", 11000.75),
    NOTEBOOK("Notebook", 35000.25),
    CAMERA("Camera", 4500.45),
    SCOOTER("Scooter", 8000.17),
    LAMP ("Lamp", 750.1234);

    private String name;
    private double price;

    Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
