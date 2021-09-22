package lesson8HomeWork;

import com.sun.source.tree.Tree;
import lesson5HomeWorkCombined.PrintOperations;

public class MainClass {
    public static void main(String[] args) {
        // ---- 1 and 2 tasks from homework ----
        Worker first = new Worker("Valentin", 25, "Head message", 200);
        Worker second = new Worker();

        // Get the info about first worker
        System.out.println("Name of the first worker is " + first.getName());
        System.out.println("Age of the first worker is " + first.getAge());
        System.out.println("Position of the first worker is " + first.getPosition());
        System.out.println("Salary of the first worker is " + first.getSalary());

        // Print 1 and 2 workers
        System.out.println(first.toString());
        System.out.println(second.toString());

        // Set name and age for first worker
        first.setName("Pavel");
        first.setAge(30);

        // set position and salary for second worker
        second.setPosition("Hand message");
        second.setSalary(1000);

        // Print 1 and 2 workers
        System.out.println(first.toString());
        System.out.println(second.toString());

        // ---- 3 task from homework ----
        PrintOperations.printSeparator();

        System.out.println("Dog appetite: " + Dog.appetite);
        Dog.eat();
        Dog.appetite = "Good boi is not hungry anymore! We have a happy dog here :)";
        System.out.println(Dog.appetite);

        // ---- 4 task from homework ----
        PrintOperations.printSeparator();

        Shoes trainers = new Shoes();
        Shoes boots = new Shoes("Timberland", 45, 100);
        Shoes flipFlop = new Shoes("Flip Flip", 120);

        System.out.println("For now, you have " + Shoes.getQtyProduct() + " shoes in your shopping bag");

        boots.setBrand("Jack & Jones");
        boots.setSize(45);
        boots.setPrice(97);

        System.out.print("Yuu might also like: ");
        System.out.println(boots.toString());

        // ---- 5 task from homework ----
        PrintOperations.printSeparator();
        Table table1 = new Table(24, "Oak");
        Table table2 = new Table(26, "Pine");

        Chair chair1 = new Chair(24, "Oak");
        Chair chair2 = new Chair(13, "Birch");

        // Equality
        System.out.println("Table is a chair? " + table1.equals(chair1));
        //System.out.println("Table is a chair? " + (table1 == chair1));

    }
}