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

    static void printBooks(Printable[] printable) {
        for (Printable printB : printable) {
            if (printB instanceof Book) {
                System.out.println(((Book) printB).getName());
            }
        }
    }

    public String getName() {
        return name;
    }
}
