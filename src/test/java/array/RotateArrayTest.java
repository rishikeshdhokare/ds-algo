package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateArrayTest {

    private RotateArray rotateArray = new RotateArray();

    @Test
    public void shouldRotateArrayByGivenOffset_WithAuxiliarySpace() {
        int[] input1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(new int[]{3, 4, 5, 6, 7, 1, 2}, rotateArray.rotateWithAuxSpace(input1, 2));

        int[] input2 = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(new int[]{6, 7, 1, 2, 3, 4, 5}, rotateArray.rotateWithAuxSpace(input2, 5));

        int[] input3 = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, rotateArray.rotateWithAuxSpace(input3, 7));
    }

    @Test
    public void shouldRotateArrayByGivenOffset_InMemory() {
        int[] input1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(new int[]{3, 4, 5, 6, 7, 1, 2}, rotateArray.rotateInMemory(input1, 2));

        int[] input2 = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(new int[]{6, 7, 1, 2, 3, 4, 5}, rotateArray.rotateInMemory(input2, 5));

        int[] input3 = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, rotateArray.rotateInMemory(input3, 7));
    }
}