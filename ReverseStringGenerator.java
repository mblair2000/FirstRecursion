package recursion;

/**
 * this class reverses strings
 * @author mblair2000
 * @version 2020.10.8
 */
public class ReverseStringGenerator
{
    // Fields -------------------------------------------------------
    // Constructor --------------------------------------------------
    /**
     * constructor, but leave blank
     */
    public ReverseStringGenerator()
    {
        //leave blank purposefully
    }
    // Methods ------------------------------------------------------
    /**
     * returns a string in reverse
     * @param str is the string input into the method
     * @return the string in reverse
     */
    public static String reverse(String str)
    {
        if (str.length() == 0 || str.length() == 1)
        {
            return str;
        }
        else
        {
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }
}
