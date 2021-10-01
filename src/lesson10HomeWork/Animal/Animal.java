package lesson10HomeWork.Animal;

public abstract class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public abstract void makeNoise();

    public abstract void eat();

    public void sleep() {
        System.out.println("Animal is sleeping...");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
