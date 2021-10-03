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
        switch(this.size) {
            case XXS: System.out.println("Size " + Size.XXS + " (Euro size: " + size.getEuroSize() + "), " + size.getDescription()); break;
            case XS: System.out.println("Size " + Size.XS + " (Euro size: " + size.getEuroSize() + "), " + size.getDescription()); break;
            case S: System.out.println("Size " + Size.S + " (Euro size: " + size.getEuroSize() + "), " + size.getDescription()); break;
            case M: System.out.println("Size " + Size.M + " (Euro size: " + size.getEuroSize() + "), " + size.getDescription()); break;
            case L: System.out.println("Size " + Size.L + " (Euro size: " + size.getEuroSize() + "), " + size.getDescription()); break;
            default: System.out.println("Unknown size");
        }
    }

    public Size getSize() {
        return size;
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
