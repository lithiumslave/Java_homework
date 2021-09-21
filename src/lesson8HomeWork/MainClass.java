package lesson8HomeWork;

import lesson5HomeWorkCombined.PrintOperations;

public class MainClass {
    public static void main(String[] args) {
        // 1 and 2 tasks from homework
        Worker first = new Worker("Valentin", 25, "Head message", 200);
        Worker second = new Worker();

        System.out.println("Name of the first worker is " + first.getName());
        System.out.println("Age of the first worker is " + first.getAge());
        System.out.println("Position of the first worker is " + first.getPosition());
        System.out.println("Salary of the first worker is " + first.getSalary());

        // Print 1 and 2 workers
        PrintOperations.printSeparator();
        System.out.println(first.toString());
        System.out.println(second.toString());

        // Set name and age for first worker
        first.setName("Pavel");
        first.setAge(30);

        // set position and salary for second worker
        second.setPosition("Hand message");
        second.setSalary(1000);

        // Print 1 and 2 workers
        PrintOperations.printSeparator();
        System.out.println(first.toString());
        System.out.println(second.toString());

        // 3 task from homework
        PrintOperations.printSeparator();
        System.out.println(Dog.appetite);
        Dog.eat();
    }
}
