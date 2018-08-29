package stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackUsingLinkedListTest {

    @Test
    public void shouldPushAndPop() {
        StackUsingLinkedList stack = new StackUsingLinkedList();
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
    }
}