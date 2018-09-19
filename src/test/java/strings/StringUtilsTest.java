package strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilsTest {

    private StringUtils stringUtils = new StringUtils();

    @Test
    public void shouldUpperCaseFirstLetterOfAllWords() {
        String sentence = "object oriented programming";
        assertEquals("Object Oriented Programming", stringUtils.upCaseFirstLetterInWord(sentence));
    }
}