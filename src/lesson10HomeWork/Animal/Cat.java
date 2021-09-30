package lesson10HomeWork.Animal;

public class Cat extends Animal{
    public void setHateHuman(String hateHuman) {
        this.hateHuman = hateHuman;
    }

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

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    public String getHateHuman() {
        return hateHuman;
    }
}
