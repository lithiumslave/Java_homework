package lesson10HomeWork.Animal;

public class Veterinarian {
    public void treatAnimal(Animal animal) {
        print("Type of animal: " + animal.getClass().getSimpleName());
        print("Food: " + animal.getFood());
        print("Location: " + animal.getLocation());
        if(animal instanceof Cat) {
            print("Cat loves human or not? - " + ((Cat) animal).getHateHuman());
            } else if(animal instanceof Dog) {
            print("Dog loves human or not? - " + ((Dog) animal).getLoveHuman());
            } else if(animal instanceof Horse) {
            print("Is horse beautiful or not? - " + ((Horse) animal).getBeauty());
            } else {
            print("Undefined animal");
            }
    }

    private void print(String text) {
        System.out.println(text);
    }
}
