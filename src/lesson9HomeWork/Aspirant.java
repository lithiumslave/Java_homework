package lesson9HomeWork;

public class Aspirant extends Student{
    private String scienceWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }

    @Override
    public double getScholarship() {
        if (getAverageMark() == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
