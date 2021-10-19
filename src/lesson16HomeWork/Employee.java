package lesson16HomeWork;

public class Employee {
    private String name;
    private String surname;
    private int payslip;
    private int personalCashAccount;
    private int startYear;
    private Months startMonth;
    private String gender;
    private String department;

    public Employee(String name, String surname, int payslip, int personalCashAccount, int startYear, Months startMonth) {
        this.name = name;
        this.surname = surname;
        this.payslip = payslip;
        this.personalCashAccount = personalCashAccount;
        this.startYear = startYear;
        this.startMonth = startMonth;
    }

    @Override
    public String toString() {
        return "Employee [" +
                "Name = '" + name + '\'' +
                ", Surname = '" + surname + '\'' +
                ", Payslip summary = " + payslip +
                ", Cash on personal account = " + personalCashAccount +
                ", Start working from " + startMonth + " of " + startYear +
                ']';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPayslip() {
        return payslip;
    }

    public int getPersonalCashAccount() {
        return personalCashAccount;
    }

    public int getStartYear() {
        return startYear;
    }

    public Months getStartMonth() {
        return startMonth;
    }

    public void setPersonalCashAccount(int personalCashAccount) {
        this.personalCashAccount = personalCashAccount;
    }
}
