package array;

import org.junit.Assert;
import org.junit.Test;

public class MoveZerosTest {

    private MoveZeros moveZeros = new MoveZeros();

    @Test
    public void shouldNotDoAnythingForOneElementInArray() {
        int[] input1 = new int[] {0};
        int[] output1 = moveZeros.moveZeros(input1);
        Assert.assertArrayEquals(input1, output1);

        int[] input2 = new int[] {5};
        int[] output2 = moveZeros.moveZeros(input2);
        Assert.assertArrayEquals(input2, output2);
    }

    @Test
    public void shouldMoveZerosToTheEndOfArray() {
        int[] input = new int[] {0, 2, 3, 0, 5};
        int[] output = moveZeros.moveZeros(input);
        Assert.assertArrayEquals(new int[] {2, 3, 5, 0, 0}, output);
    }

    @Test
    public void shouldMoveZerosToTheEndOfArrayHavingZerosInTheBeginning() {
        int[] input = new int[] {0, 0, 0, 0, 2, 3, 8, 5};
        int[] output = moveZeros.moveZeros(input);
        Assert.assertArrayEquals(new int[] {2, 3, 8, 5, 0, 0, 0, 0}, output);
    }
}