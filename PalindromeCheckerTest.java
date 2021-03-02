package recursion;

/**
 * tests the palindrome checker method
 * @author mblair2000
 * @version 2020.10.8
 */
public class PalindromeCheckerTest extends student.TestCase
{
    /**
     * sets up each method
     */
    public void setUp()
    {
        new PalindromeChecker();
    }
    /**
     * test the method
     */
    public void testIsPalindrome()
    {
        assertTrue(PalindromeChecker.isPalindrome(""));
        assertTrue(PalindromeChecker.isPalindrome("a"));
        assertTrue(PalindromeChecker.isPalindrome("Go hang a "
                + "salami, I'm a lasagna hog"));
        assertTrue(PalindromeChecker.isPalindrome("A Toyota! "
                + "Race fast, safe car. A Toyota."));
        assertTrue(PalindromeChecker.isPalindrome("Tie Mandie"
                + ", I'd name it."));
        assertTrue(PalindromeChecker.isPalindrome("Wonton? Not now."));
        
        String str = null;
        assertFalse(PalindromeChecker.isPalindrome(str));
        str = "Apples";
        assertFalse(PalindromeChecker.isPalindrome(str));
    }
}
