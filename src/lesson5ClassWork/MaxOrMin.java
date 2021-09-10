package lesson5ClassWork;

import java.lang.management.ManagementFactory;

public class MaxOrMin {
    public static void main(String[] args) {
        int array[] = {2, 12, 6, 16, 85, 12, 54};
        System.out.println(sumArrayElements(array));
    }

    public static int sumArrayElements(int[] array) {
        int maximum = array[0];

        for (int i = 0; i < array.length; i++) {
            if (maximum < array[i]) {
                maximum = array[i];
            }
        }
        int minimum = array[0];

        for (int i = 0; i < array.length; i++) {
            if (minimum > array[i]) {
                minimum = array[i];
            }
        }
        return minimum + maximum;
    }
}
