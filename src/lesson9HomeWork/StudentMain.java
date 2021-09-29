package lesson9HomeWork;

public class StudentMain {
    public static void main(String[] args) {
        Student stud1 = new Student("John", "Locke", "2-B", 4.6);
        Student stud2 = new Student("Jack", "Shephard", "2-C", 5);
        Student asp1 = new Aspirant("James", "Sawyer", "3-P", 4.7, "I kill Sawyer");
        Student asp2 = new Aspirant("Kate", "Austen", "4-D", 5, "I'm the wasp");
        Student asp3 = new Aspirant("Juliet", "Burke", "4-D", 4.9, "The Others biaaatch");

        Student[] students = {stud1, stud2, asp1, asp2, asp3};
        for (Student stud : students) {
            System.out.println(stud.getFirstName() + ": " + stud.getScholarship());
        }
    }
}
