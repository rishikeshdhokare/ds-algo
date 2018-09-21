package codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringBuilderTest {

    private StringBuilder stringBuilder = new StringBuilder();

    @Test
    public void shouldBuildString() {
        assertEquals("aabbaaba", stringBuilder.build(5, 3));
        assertEquals("aabbab", stringBuilder.build(3, 3));
        assertEquals("bbabb", stringBuilder.build(1, 4));
    }
}