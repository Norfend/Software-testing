package cz.cvut.fel.ts1;

public class FactorialCalculator {

    public static long Factorial(int n){
        if (n < 0){
            throw new IllegalArgumentException("Factorial for negative numbers doesn't exist");
        }
        if (n < 1){
            return 1;
        }
        else {
            return n * Factorial(n - 1);
        }
    }
}
