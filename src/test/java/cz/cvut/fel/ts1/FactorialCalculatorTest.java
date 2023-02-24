package cz.cvut.fel.ts1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialCalculatorTest {

    @Test
    public void shouldReturnException() {

        String expectedMessage = "Factorial for negative numbers doesn't exist";
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> FactorialCalculator.Factorial(-1));
        String actualMessage = exception.getMessage();

        assertEquals(actualMessage, expectedMessage); //compare actual, after method execution, and expected values
    }

    @Test
    public void shouldReturnFactorialByZero() {

        long expected = 1;
        long actual = FactorialCalculator.Factorial(0);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnFactorialByPositiveNum() {

        long expected = 120;
        long actual = FactorialCalculator.Factorial(5);

        assertEquals(actual, expected);
    }
}
