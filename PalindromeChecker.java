package recursion;

/**
 * checks to see if a word is a palindrome
 * @author mblair2000
 * @version 2020.10.8
 *
 */
public class PalindromeChecker extends ReverseStringGenerator
{
    /**
     * check to see if a word is a palindrome, true if yes
     * @param str is the word checked to see if a palindrome
     * @return true if the word is a palindrome
     */
    public static boolean isPalindrome(String str)
    {
        if (str == null)
        {
            return false;
        }
        else if (str.length() == 0 || str.length() == 1)
        {
            return true;
        }
        else
        {
            String str2 = str;
            str2 = str.toLowerCase();
            str2 = str2.replace("?", "");
            str2 = str2.replace("\'", "");
            str2 = str2.replace("!", "");
            str2 = str2.replace(",", "");
            str2 = str2.replace(".", "");
            str2 = str2.replace("/", "");
            str2 = str2.replace(" ", "");
            
            //new ReverseStringGenerator();
            //String strNew = ReverseStringGenerator.reverse(str2);
            
            //return (strNew.equals(str2));
            

            if (str2.charAt(0) == str2.charAt(str2.length() - 1))
            {
                return isPalindrome(str2.substring(1, str2.length() - 1));
            }
            return false;
        }
    }
}