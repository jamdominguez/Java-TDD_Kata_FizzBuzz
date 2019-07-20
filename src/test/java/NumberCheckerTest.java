import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberCheckerTest {

    @Test
    public void zeroReturnZero() {
        assertEquals("0", NumberChecker.fizzBuzz(0));
    }
}
