package sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {

    private SelectionSort selectionSort = new SelectionSort();

    @Test
    public void shouldSortArray() {
        int[] array = new int[]{7, 6, 5, 4, 3, 2, 1};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, selectionSort.sort(array));
    }
}