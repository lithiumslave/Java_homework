package lesson10HomeWork.Animal;

public abstract class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Animal make noise");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public abstract void sleep();

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
