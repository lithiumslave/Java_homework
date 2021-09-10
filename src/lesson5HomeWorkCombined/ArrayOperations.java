package lesson5HomeWorkCombined;

public class ArrayOperations {

    public static int sumOfArrayValues(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        return sum;
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

    public static void printArrayWithComaBetweenValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static int[] arrayWithRandomNumbers(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20) + 1;;
        }
        return array;
    }
}
