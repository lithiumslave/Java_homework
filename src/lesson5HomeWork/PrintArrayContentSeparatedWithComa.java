package lesson5HomeWork;

public class PrintArrayContentSeparatedWithComa {
    public static void main(String[] args) {
        int arr[] = {2, 6, 3, 8, 12, 75};
        printArrayWithComaBetweenValues(arr);
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

}
