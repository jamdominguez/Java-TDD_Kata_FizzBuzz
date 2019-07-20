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
}
