package lesson10HomeWork.Animal;

public class Cat extends Animal{
    private String hateHuman;

    public Cat(String food, String location, String hateHuman) {
        super(food, location);
        this.hateHuman = hateHuman;
    }

    public void makeNoise() {
        System.out.println("MEOW MEOW");
    }

    public void eat() {
        System.out.println("Cat is eating some food");
    }

    public String getHateHuman() {
        return hateHuman;
    }

    public void setHateHuman(String hateHuman) {
        this.hateHuman = hateHuman;
    }
}
