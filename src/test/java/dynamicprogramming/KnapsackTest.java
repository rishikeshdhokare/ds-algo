package dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class KnapsackTest {

    private Knapsack knapSack = new Knapsack();

    @Test
    public void shouldFindMaxValue() {
        int values[] = new int[]{60, 100, 120};
        int weights[] = new int[]{10, 20, 30};
        int weight = 50;
        int size = values.length;
        assertEquals(220, knapSack.knapsack(weights, values, weight, size));
    }
}