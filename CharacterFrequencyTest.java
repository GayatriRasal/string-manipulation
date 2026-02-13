import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Map;

public class CharacterFrequencyTest {

    @Test
    public void testNormalString() {
        Map<Character, Integer> result =
                CharacterFrequency.getCharacterFrequency("hello");

        assertEquals(1, (int) result.get('h'));
        assertEquals(1, (int) result.get('e'));
        assertEquals(2, (int) result.get('l'));
        assertEquals(1, (int) result.get('o'));
        assertEquals(4, result.size());
    }

    @Test
    public void testRepeatedCharacters() {
        Map<Character, Integer> result =
                CharacterFrequency.getCharacterFrequency("aaa");

        assertEquals(3, (int) result.get('a'));
        assertEquals(1, result.size());
    }

    @Test
    public void testEmptyString() {
        Map<Character, Integer> result =
                CharacterFrequency.getCharacterFrequency("");

        assertTrue(result.isEmpty());
    }

    @Test
    public void testNullInput() {
        Map<Character, Integer> result =
                CharacterFrequency.getCharacterFrequency(null);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testCaseSensitivity() {
        Map<Character, Integer> result =
                CharacterFrequency.getCharacterFrequency("Aa");

        assertEquals(1, (int) result.get('A'));
        assertEquals(1, (int) result.get('a'));
        assertEquals(2, result.size());
    }
}
