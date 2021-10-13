package lesson13HomeWork.MyCustomException;

public class RunMain {
    public static void main(String[] args) {
        RunPlan runner1 = new RunPlan("Thin");
        RunPlan runner2 = new RunPlan("Fat");

        runner1.run(2);
        runner1.run(8);
        runner2.run(15);
        runner2.run(9);
    }
}
