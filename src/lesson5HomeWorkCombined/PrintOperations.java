package lesson5HomeWorkCombined;

public class PrintOperations {
    public static void greeting(String name) {
        System.out.println("GOOOOOD MORNING, VIETNAM! " + "We have a new person here, please welcome " + name.toUpperCase() + "! Enjoy and have fun ;)");
    }

    public static void printSeparator() {
        System.out.println("************************************************************************");
    }

    public static void multiplicationTable(double num) {
        for (int i = 1; i <= 10; ++i) {
            System.out.println(num + "*" + i + "=" + num * i);
        }
    }

    public static void stairs(int rows) {
        for (int j = 0; j < rows; j++) {
            for (int h = 0; h <= j; h++) {
                if (h == 0){
                    System.out.print("##");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    public static void rectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
                if (j == (b - 1)) {
                    System.out.println();
                }
            }
        }
    }
}
