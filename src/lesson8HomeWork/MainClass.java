package lesson8HomeWork;

public class MainClass {
    public static void main(String[] args) {
        Worker work = new Worker();
        System.out.println(work.getName());
        System.out.println(work.getAge());
        System.out.println(work.getPosition());
        System.out.println(work.getSalary());

        System.out.println(work.setName("Pavel"));
        System.out.println(work.setAge(30));
        System.out.println(work.setPosition("Hand message"));
        System.out.println(work.setSalary(1000));
    }
}
