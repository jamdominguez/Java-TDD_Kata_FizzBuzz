public class NumberChecker {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static String fizzBuzz(int i) {
        StringBuilder result = new StringBuilder();

        if (i != 0 && i % 3 == 0) result.append(FIZZ); //not 0 and divisible by 3
        if (i != 0 && i % 5 == 0) result.append(BUZZ); //not 0 and divisible by 5
        if (result.length() == 0) result.append(i); //other case return the number

        return result.toString();
    }
}
