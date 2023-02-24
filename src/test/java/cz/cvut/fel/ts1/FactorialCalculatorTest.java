package cz.cvut.fel.ts1;
import org.junit.jupiter.api.Test;

public class FactorialCalculatorTest {
    @Test
    public void factorialTest(){
        FactorialCalculator.Factorial(5);
        FactorialCalculator.Factorial(3);
        FactorialCalculator.Factorial(10);
    }
}
