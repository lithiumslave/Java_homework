package lesson7Control;

import java.security.PublicKey;

public class ControlMethods {
    public static int[] arrWithEvenOnly(int[] array) {
            int[] evenArr = new int[10];
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    evenArr[i] = array[i];
                } else {
                    evenArr[i] = evenArr[i + 1];
                }
            }
            return evenArr;
        }


    public static String armstrongCheck(int num) {
        String arms = "Number is Armstrong";
        String notArms = "Number is not Armstrong";

        int remainder;
        int sum = 0;

        for (int i = num; i > 0; i = i / 10) {
            remainder = i % 10;
            sum = sum + remainder * remainder * remainder;
        }

        if (sum == num) {
            return arms;
        } else {
            return notArms;
        }
    }

    public static String reverseString(String a) {
        String rightPart;
        String leftPart;

        int length = a.length();

        if (length <= 1) {
            return a;
        }

        leftPart = a.substring(0, length / 2);
        rightPart = a.substring(length / 2, length);

        return reverseString(rightPart) + reverseString(leftPart);
    }

    public static String FizzBuzz(int x) {
        String fizz = "Fizz";
        String buzz = "Buzz";
        String fizzBuzz = "FizzBuzz";
        String notFizzBuzz = "Not a Fizz and not a Buzz";

        String result = "";
        if (x % 5 == 0 && x % 7 == 0) {
            result = fizzBuzz;
        } else if (x % 5 == 0 && x % 7 != 0) {
            result = fizz;
        } else if (x % 7 == 0 && x % 5 !=0) {
            result = buzz;
        } else if (x % 7 != 0 && x % 5 !=0) {
            result = notFizzBuzz;
        }

        return result;
    }
}
