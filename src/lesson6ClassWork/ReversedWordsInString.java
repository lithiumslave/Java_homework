package lesson6ClassWork;

public class ReversedWordsInString {
    public static void main(String[] args) {
        String hi = "Hello world";
        System.out.println("Reversed: " + reverseString(hi));
    }

    public static String reverseString(String reverse) {
            String result = "";

            for (int i = reverse.length() - 1; i >= 0; i--) {
                result += reverse.charAt(i);
            }

            return result;
    }
}
