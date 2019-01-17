import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    Fibonacci fibonacciTest;

    @BeforeEach
    void setUp() {
        fibonacciTest = new Fibonacci();
    }

    @Test
    void shouldGetZeroFibonacci() {
        assertEquals(0, fibonacciTest.getFibonacci(0));
    }

    @Test
    void shouldGetFirstFibonacci() {
        assertEquals(1, fibonacciTest.getFibonacci(1));
    }

    @Test
    void shouldGetEightFibonacci() {
        assertEquals(21, fibonacciTest.getFibonacci(8));
    }

}