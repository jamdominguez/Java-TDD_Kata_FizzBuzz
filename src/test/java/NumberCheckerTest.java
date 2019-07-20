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
        assertEquals("Fizz", NumberChecker.fizzBuzz(3));
    }

    @Test
    public void fourReturnFour() {
        assertEquals("4", NumberChecker.fizzBuzz(4));
    }

    @Test
    public void fiveReturnBuzz() {
        assertEquals("Buzz", NumberChecker.fizzBuzz(5));
    }

    @Test
    public void sixReturnFizz() {
        assertEquals("Fizz", NumberChecker.fizzBuzz(6));
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
        assertEquals("Fizz", NumberChecker.fizzBuzz(9));
    }
}
