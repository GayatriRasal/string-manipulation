import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramCheckerTest {

    AnagramChecker ac = new AnagramChecker();
    Random random = new Random();

    @Test
    void testSimpleAnagram() {
        assertTrue(ac.isAnagram("listen", "silent"));
        assertTrue(ac.isAnagram("a", "a"));
    }

    @Test
    void testMixedCaseAnagram() {
        assertTrue(ac.isAnagram("Triangle", "Integral"));
        assertTrue(ac.isAnagram("TRi@ngLe", "INtegr@l"));
    }

    @Test
    void testAnagramWithSpaces() {
        assertTrue(ac.isAnagram("conversation", "voices rant on"));
    }

    @Test
    void testNotAnagram() {
        assertFalse(ac.isAnagram("hello", "world"));
        assertFalse(ac.isAnagram("hello", "wor!d"));
    }

    @Test
    void testDifferentLengths() {
        assertFalse(ac.isAnagram("abc", "ab"));
    }

    @Test
    void testEmptyStrings() {
        assertTrue(ac.isAnagram("", ""));
        assertFalse(ac.isAnagram("ab", ""));
    }

    @RepeatedTest(5)
    void testRandomAnagrams() {
        String word = generateRandomString(8);
        String shuffled = shuffleString(word);

        assertTrue(ac.isAnagram(word, shuffled));
    }

    private String generateRandomString(int length) {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }

    private String shuffleString(String input) {
        char[] array = input.toCharArray();
        for (int i = 0; i < array.length; i++) {
            int randomIndex = random.nextInt(array.length);
            char temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
        return new String(array);
    }
}
