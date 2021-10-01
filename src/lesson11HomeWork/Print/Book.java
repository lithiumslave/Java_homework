package lesson11HomeWork.Print;

import lesson10HomeWork.Animal.Cat;
import lesson10HomeWork.Animal.Dog;
import lesson10HomeWork.Animal.Horse;

public class Book implements Printable{
    private int pageNums;
    private String name;

    public Book(int pageNums, String name) {
        this.pageNums = pageNums;
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Need to print book with " + pageNums + " pages");
    }

   /* static void printBooks(Printable[] printable) {
        for (Printable print : printable) {
            printable.
        }


        if(printable instanceof Cat) {
            print("Cat loves human or not? - " + ((Cat) animal).getHateHuman());
        } else if(animal instanceof Dog) {
            print("Dog loves human or not? - " + ((Dog) animal).getLoveHuman());
        } else if(animal instanceof Horse) {
            print("Is horse beautiful or not? - " + ((Horse) animal).getBeauty());
        } else {
            print("Undefined animal");
        }
    }*/

    public int getPageNums() {
        return pageNums;
    }

    public void setPageNums(int pageNums) {
        this.pageNums = pageNums;
    }
}
