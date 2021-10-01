package lesson10HomeWork.Animal;

public class Dog extends Animal{
    private String loveHuman;


    public Dog(String food, String location, String loveHuman) {
        super(food, location);
        this.loveHuman = loveHuman;
    }

    public void makeNoise() {
        System.out.println("GOW GOW");
    }

    public void eat() {
        System.out.println("Dog is eating some food");
    }

    public String getLoveHuman() {
        return loveHuman;
    }

}
