public class NumberChecker {
    public static String fizzBuzz(int i) {
        if (i == 0) return "0";
        else if (i%3 == 0) return "Fizz";
        else if (i == 5) return "Buzz";
        return String.valueOf(i);
    }
}
