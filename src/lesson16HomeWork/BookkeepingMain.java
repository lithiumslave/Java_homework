package lesson16HomeWork;

import lesson5HomeWorkCombined.PrintOperations;

import java.util.List;

public class BookkeepingMain {
    public static void main(String[] args) {
        Firm firm = new Firm();

        // Printing all the employees
        List<Employee> employees = firm.getAuthorisedVehicles();
        firm.printAllEmployees();

        PrintOperations.printSeparator();
        System.out.println("Pay salaries to all employees");
        PrintOperations.printSeparator();

        // Paying salaries for all employees and print them again
        firm.giveSalaryForAll();
        firm.printAllEmployees();
        PrintOperations.printSeparator();
        // System.out.println(firm.getPayrollAccount());

        // Calculate vacations for all the employees
        firm.calcVacations();

    }
}
