package lesson9HomeWork;

public class Student {
    private String firstName, lastName, group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getScholarship() {
        if (averageMark == 5) {
            return 100;
        } else {
            return 80;
        }
    }

    public double getAverageMark() {
        return averageMark;
    }

    public String getFirstName() {
        return firstName;
    }
}
