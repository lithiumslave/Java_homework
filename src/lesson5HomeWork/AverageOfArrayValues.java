package lesson5HomeWork;

public class AverageOfArrayValues {
    public static void main(String[] args) {
        int intArray[] = {1, 2, 3, 5, 6, 7, 11, 13, 19};
        long longArray[] = {1000000, 1000001, 1000000000, 1000000001};

        System.out.println(averageOfArrayValues(intArray));
        System.out.println(averageOfArrayValues(longArray));
    }

    public static double averageOfArrayValues(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        double average = sum / arr.length;
        return average;
    }

    public static double averageOfArrayValues(long[] arr) {
        double sum = 0;
        for (long i : arr) {
            sum = sum + i;
        }
        double average = sum / arr.length;
        return average;
    }
}
