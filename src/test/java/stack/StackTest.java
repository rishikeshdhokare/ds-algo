package stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StackTest {

    @Test
    public void shouldPushAndPop() {
        Stack stack = new Stack(5);
        assertTrue(stack.isEmpty());

        try {
            stack.pop();
        } catch (IllegalStateException e) {
            assertEquals("stack is empty", e.getMessage());
        }
        stack.push(1);
        stack.push(2);

        assertFalse(stack.isEmpty());

        int popped = stack.pop();
        assertEquals(2, popped);

        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        try {
            stack.push(7);
        } catch (IllegalStateException e) {
            assertEquals("stack is full", e.getMessage());
        }
    }
}