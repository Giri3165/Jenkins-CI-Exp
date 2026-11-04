import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FibonacciTest {

    @Test
    void testFibonacciSeries() {
        Fibonacci fibonacci = new Fibonacci();

        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 35};

        assertArrayEquals(expected, fibonacci.getSeries(10));
    }
}
