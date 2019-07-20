import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberCheckerTest {

    @Test
    public void zeroReturnZero() {
        assertEquals("0", NumberChecker.fizzBuzz(0));
    }

    @Test
    public void oneReturnOne() {
        assertEquals("1", NumberChecker.fizzBuzz(1));
    }

    @Test
    public void twoReturnTwo() {
        assertEquals("2", NumberChecker.fizzBuzz(2));
    }

    @Test
    public void threeReturnFizz() {
        assertEquals(NumberChecker.FIZZ, NumberChecker.fizzBuzz(3));
    }

    @Test
    public void fourReturnFour() {
        assertEquals("4", NumberChecker.fizzBuzz(4));
    }

    @Test
    public void fiveReturnBuzz() {
        assertEquals(NumberChecker.BUZZ, NumberChecker.fizzBuzz(5));
    }

    @Test
    public void sixReturnFizz() {
        assertEquals(NumberChecker.FIZZ, NumberChecker.fizzBuzz(6));
    }

    @Test
    public void sevenReturnSeven() {
        assertEquals("7", NumberChecker.fizzBuzz(7));
    }

    @Test
    public void eightReturnEight() {
        assertEquals("8", NumberChecker.fizzBuzz(8));
    }

    @Test
    public void nineReturnFizz() {
        assertEquals(NumberChecker.FIZZ, NumberChecker.fizzBuzz(9));
    }

    @Test
    public void tenReturnBuzz() {
        assertEquals(NumberChecker.BUZZ, NumberChecker.fizzBuzz(10));
    }

    @Test
    public void twelveReturnFizz() {
        assertEquals(NumberChecker.FIZZ, NumberChecker.fizzBuzz(12));
    }

    @Test
    public void fifteenReturnFizzBuzz() {
        assertEquals(NumberChecker.FIZZ + NumberChecker.BUZZ, NumberChecker.fizzBuzz(15));
    }

    @Test
    public void onlyDivisibleByThreeReturnFizz() {
        int[] numbers = {3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39};
        for (int number : numbers) {
            assertEquals(NumberChecker.FIZZ, NumberChecker.fizzBuzz(number));
        }
    }

    @Test
    public void onlyDivisibleByFiveReturnBuzz() {
        int[] numbers = {5, 10, 20, 25, 35, 40, 50, 55, 65, 70, 80};
        for (int number : numbers) {
            assertEquals(NumberChecker.BUZZ, NumberChecker.fizzBuzz(number));
        }
    }

    @Test
    public void divisibleByThreeAndFiveReturnFizzBuzz() {
        int[] numbers = {15, 30, 45, 60, 75, 90, 105, 120, 135, 150, 165};
        for (int number : numbers) {
            assertEquals(NumberChecker.FIZZ + NumberChecker.BUZZ, NumberChecker.fizzBuzz(number));
        }
    }
}
