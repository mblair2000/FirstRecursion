package recursion;

/**
 * @author mblair2000
 * @version 2020.10.8
 */
public class ReverseStringGeneratorTest extends student.TestCase
{
    // fields
    // setup
    /**
     * sets up each method
     */
    public void setUp()
    {
        new ReverseStringGenerator();
    }
    // methods
    /**
     * tests the reverse() method to make sure it can return a string
     * in reverse
     */
    public void testReverse()
    {
        String str = "dcba";
        assertEquals(ReverseStringGenerator.reverse("abcd"), str);
        String str2 = "";
        String str3 = "1";
        assertEquals(ReverseStringGenerator.reverse(""), str2);
        assertEquals(ReverseStringGenerator.reverse("1"), str3);
    }
}