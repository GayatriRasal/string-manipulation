import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class PalindromeTest {
    
    @Test
    public void testNullInput() {
        assertFalse(Palindrome.isPalindrome(null));
    }

     @Test
    public void testEmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    public void testOnlySpaces() {
        assertTrue(Palindrome.isPalindrome("   "));
    }

     @Test
    public void testSimplePalindromes() {
        assertTrue(Palindrome.isPalindrome("madam"));
        assertTrue(Palindrome.isPalindrome("racecar"));
        assertTrue(Palindrome.isPalindrome("abba"));
    }

    @Test
    public void testNonPalindromes() {
        assertFalse(Palindrome.isPalindrome("hello"));
        assertFalse(Palindrome.isPalindrome("abc"));
        assertFalse(Palindrome.isPalindrome("ab"));
    }

    @Test
    public void testCaseInsensitive() {
        assertTrue(Palindrome.isPalindrome("Madam"));
        assertTrue(Palindrome.isPalindrome("RaceCar"));
        assertTrue(Palindrome.isPalindrome("AbBa"));
    }

    @Test
    public void testWithSpaces() {
        assertTrue(Palindrome.isPalindrome("nurses run"));
        assertTrue(Palindrome.isPalindrome("race car"));
        assertTrue(Palindrome.isPalindrome("a man a plan a canal panama"));
    }

    @Test
    public void testWithSpecialCharacters() {
        assertFalse(Palindrome.isPalindrome("madam!"));
        assertFalse(Palindrome.isPalindrome("race-car"));
    }
}
