package lesson10HomeWork.Animal;

import lesson5HomeWorkCombined.PrintOperations;

public class AnimalMain {
    public static void main(String[] args) {
        Animal dog = new Dog("Meat", "Street", "Human is my friend");
        Animal cat = new Cat("Fish", "Home", "Human sucks");
        Animal horse = new Horse("Carrot", "Stable", "Very beautiful");
        Veterinarian vet = new Veterinarian();

        Animal[] animals = {dog, cat, horse};

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
            PrintOperations.printSeparator();
        }
    }
}
