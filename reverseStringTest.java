import static org.junit.Assert.assertEquals;

import org.junit.*;

public class reverseStringTest {
    @Test
public void testForReverseString(){
String result = reverseString.reverse("hello");
assertEquals("olleh", result);
}

@Test
public void testSingleCharacter() {
String result = reverseString.reverse("a");
assertEquals("a", result);
}

@Test
public void testEmptyString() {
String result = reverseString.reverse("");
assertEquals("", result);
}

@Test
public void testPalindrome() {
String result = reverseString.reverse("madam");
assertEquals("madam", result);
}

@Test
public void testStringWithSpaces() {
String result = reverseString.reverse("hello world");
assertEquals("dlrow olleh", result);
}

@Test
public void testSpecialCharacters() {
String result = reverseString.reverse("abc123!");
assertEquals("!321cba", result);
}
}
