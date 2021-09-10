package lesson5ClassWork;

import java.util.Arrays;

public class CharArrayToAsciiArray {
    public static void main(String[] args) {
        char[] charArray = {'r', 's', '!', '{', '‹', 'Ô'};
        System.out.println(Arrays.toString(asciiInt(charArray)));
    }

    public static int[] asciiInt(char[] arr) {
        int[] charLength = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            charLength[i] = arr[i];
        }
        return charLength;
    }
}
