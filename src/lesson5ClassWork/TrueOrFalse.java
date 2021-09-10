package lesson5ClassWork;

public class TrueOrFalse {
    public static void main(String[] args) {
        System.out.println(isEven(5));
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    //  return (number % 2 == 0) ? true : false;

    //  return number % 2 == 0;
    }
}

