package lesson5HomeWork;

public class ArrayValuesSum {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 5, 6, 7, 11, 13, 19};

        System.out.println("Sum of array values is: " + sumOfArrayValues(array));
    }

    public static int sumOfArrayValues(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        return sum;
    }
}
