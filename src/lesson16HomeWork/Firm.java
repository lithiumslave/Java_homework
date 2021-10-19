package lesson16HomeWork;


import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Firm {
    private String firmName;
    private String address;
    private int payrollAccount = 1000000;
    private List<Employee> employees;

    public List<Employee> getAuthorisedVehicles(){
        employees = new ArrayList<>();
        employees.add(new Employee("Peter", "Parker", 13000, 0, 2018, Months.DECEMBER));
        employees.add(new Employee("Tony", "Stark", 20000, 1000000, 2021, Months.AUGUST));
        employees.add(new Employee("Barry", "Allen", 14000, 5000, 2016, Months.JUNE));
        employees.add(new Employee("Bruce", "Wane", 20000, 2000000, 2021, Months.FEBRUARY));
        employees.add(new Employee("Howard", "The Duck", 13000, 0, 1998, Months.FEBRUARY));

        return employees;
    }

    public void printAllEmployees() {
        employees.forEach(employee -> {
            System.out.println(employee);
        });
    }

    public void giveSalaryForAll() {
        for (Employee employee : employees) {
            employee.setPersonalCashAccount(employee.getPersonalCashAccount() + employee.getPayslip());
            payrollAccount = payrollAccount - employee.getPayslip();
        }
    }

    public void calcVacations() {
        final int currentYear = 2021;
        final int currentMonth = Months.OCTOBER.getMonthOrder();
        int vacationDays, workedMonthsNumber;

        for (Employee employee : employees) {
            // ---------------------------------------------- //
            // ЭТА ХЕРОТА СЧИТАЕТ РАЗНИЦУ МЕЖДУ ДАТАМИ В МЕСЯЦАХ
            LocalDate startDay = LocalDate.of(employee.getStartYear(), employee.getStartMonth().getMonthOrder(), 1);
            LocalDate today = LocalDate.of(currentYear, currentMonth, 1);

            Period age = Period.between(startDay, today);
            workedMonthsNumber = age.getYears() * 12 + age.getMonths();
            // ---------------------------------------------- //

            if ((workedMonthsNumber - 6) < 0) {
                System.out.println(employee.getName() + " " + employee.getSurname() + " doesn't have a vacation, he hasn't worked 6 months yet!");
            } else {
                vacationDays = workedMonthsNumber * 2;
                System.out.println(employee.getName() + " " + employee.getSurname() + " have " + vacationDays + " days of vacation!");
            }
        }
    }

    public int getPayrollAccount() {
        return payrollAccount;
    }
}
