package misc;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();

    @Test
    public void shouldFindNthElementInFibonacciSeries() {
        assertEquals(1, fibonacci.fib(1));
        assertEquals(2, fibonacci.fib(2));
        assertEquals(3, fibonacci.fib(3));
        assertEquals(5, fibonacci.fib(4));
        assertEquals(55, fibonacci.fib(9));
        assertEquals(89, fibonacci.fib(10));
    }
}