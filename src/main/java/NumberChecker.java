public class NumberChecker {
    public static String fizzBuzz(int i) {
        if (i == 0) return "0";
        StringBuilder result = new StringBuilder();
        if (i%3 == 0) result.append("Fizz");
        if (i%5 == 0) result.append("Buzz");
        if (result.length() == 0) result.append(i);

        return result.toString();
    }
}
