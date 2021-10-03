package lesson12HomeWork.Clothes;

import lesson5HomeWorkCombined.PrintOperations;

public class DressPeopleMain {
    public static void main(String[] args) {
        Clothes tshirt1 = new Tshirt(Size.L, 250, "Red");
        Clothes tshirt2 = new Tshirt(Size.XXS, 260, "Blue");
        Clothes pants = new Pants(Size.XS, 300, "Black");
        Clothes pants2 = new Pants(Size.M, 260, "White");
        Clothes skirt = new Skirt(Size.S, 240, "Blue");
        Clothes tie = new Tie(Size.L, 150, "Black with white stripes");

        Clothes[] clothes = {tshirt1, tshirt2, pants, pants2, skirt, tie};

        Atelier atelier = new Atelier();
        atelier.dressMan(clothes);
        PrintOperations.printSeparator();
        atelier.dressWoman(clothes);
    }
}
