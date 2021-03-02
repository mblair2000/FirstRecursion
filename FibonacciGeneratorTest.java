package recursion;

/**
 * Class to test the methods from the Fibonacci generator class
 * @author mblair2000
 * @version 2020.10.8
 */
public class FibonacciGeneratorTest extends student.TestCase
{
    // fields ------------------------------------------------------
    // setup -------------------------------------------------------
    /**
     * setup before all the test methods
     */
    public void setUp()
    {
        new FibonacciGenerator();
    }
    // methods -----------------------------------------------------
    /**
     * tests to make sure fib() can find the correct number in the
     * fibonacci sequence
     */
    public void testFib()
    {
        assertEquals(FibonacciGenerator.fib(0), 0, 0.1);
        assertEquals(FibonacciGenerator.fib(1), 1, 0.1);
        assertEquals(FibonacciGenerator.fib(2), 1, 0.1);
        assertEquals(FibonacciGenerator.fib(9), 34, 0.1);
    }
}