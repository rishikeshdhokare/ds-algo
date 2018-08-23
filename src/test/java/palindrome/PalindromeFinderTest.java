package palindrome;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class PalindromeFinderTest {

    private PalindromeFinder palindromeFinder;

    @Before
    public void setUp() {
        palindromeFinder = new PalindromeFinder();
    }

    @Test
    public void shouldFindIfAStringIsPalindrome() {
        assertTrue(palindromeFinder.isPalindrome("a"));
        assertTrue(palindromeFinder.isPalindrome("aa"));
        assertTrue(palindromeFinder.isPalindrome("aaa"));
        assertFalse(palindromeFinder.isPalindrome("ab"));
        assertTrue(palindromeFinder.isPalindrome("aba"));
        assertTrue(palindromeFinder.isPalindrome("aabaa"));
        assertFalse(palindromeFinder.isPalindrome("aabb"));
        assertFalse(palindromeFinder.isPalindrome("abab"));
    }

    @Test
    public void shouldFindAllPalindromesInAString() {
        String name = "abbaalla";
        palindromeFinder = new PalindromeFinder();
        Set<String> palindromes = palindromeFinder.findAllPalindromes(name);

        assertEquals(8, palindromes.size());
        assertTrue(palindromes.containsAll(asList("a", "b", "l", "aa", "bb", "ll", "abba", "alla")));
    }
}