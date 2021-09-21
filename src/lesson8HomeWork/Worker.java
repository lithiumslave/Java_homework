package lesson8HomeWork;

public class Worker {
    String name;
    int age;
    String position;
    int salary;

    // Constructors
    public Worker() {
        this.name = "Valera";
        this.age = 25;
        this.position = "Brain message";
        this.salary = 700;
    }

    public Worker(String name, int age, String position, int salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    // Methods
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

    @Override
    public String toString() {
        return "Worker {" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", position = '" + position + '\'' +
                ", salary = " + salary +
                '}';
    }
}
