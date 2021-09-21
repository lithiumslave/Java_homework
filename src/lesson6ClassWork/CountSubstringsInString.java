package lesson6ClassWork;

public class CountSubstringsInString {
    public static void main(String[] args) {
        String phrase = "Hello world, hello Java, hello homework";
        String substring1 = "ello";
        String substring2 = "wo";
        System.out.println(countOfRepeated(phrase, substring1));
        System.out.println(countOfRepeated(phrase, substring2));
        System.out.println(countOfRepeated(phrase, "ll"));
        System.out.println(countOfRepeated("Hello Valera, are you happy Valera?", "Valera"));
    }

    public static int countOfRepeated(String phrase, String substring) {
        int count = phrase.split(substring, -1).length-1;
        return count;
    }
}
