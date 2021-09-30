package lesson10HomeWork.Animal;

public class Horse extends Animal{
    private String beauty;

    public Horse(String food, String location, String beauty) {
        super(food, location);
        this.beauty = beauty;
    }

    public void makeNoise() {
        System.out.println("FHRR FHRR");
    }

    public void eat() {
        System.out.println("Horse is eating some food");
    }

    @Override
    public void sleep() {
        System.out.println("Horse is sleeping");
    }

    public String getBeauty() {
        return beauty;
    }
}
