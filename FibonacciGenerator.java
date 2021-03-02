package recursion;

/**
 * Class holding methods for the Fibonacci generator
 * @author mblair2000
 * @version 2020.10.8
 */
public class FibonacciGenerator
{
    // Constructor --------------------------------------------------
    /**
     * leave constructor blank
     */
    public FibonacciGenerator()
    {
        //leave blank on purpose, nothing to write
    }
    // Methods ------------------------------------------------------
    /**
     * This method returns the number at index n of the fibonacci
     * sequence
     * @param n is the index of the number in the sequence
     * @return number in fibonacci sequence at integer n
     */
    public static int fib(int n)
    {
        //precondition: n is non-negative
        if (n == 1 || n == 0)
        {
            return n;
        }
        else
        {
            return fib(n - 2) + fib(n - 1);
        }
    }
}