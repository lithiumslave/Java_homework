package lesson8HomeWork;

public class Worker {
    String name = "Valera";
    int age = 25;
    String position = "Brain massage";
    int salary = 700;

    public Worker() {
        this.name = "Valentin";
        this.age = 27;
        this.position = "Leg massage";
        this.salary = 900;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
