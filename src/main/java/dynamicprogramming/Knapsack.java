package dynamicprogramming;

class Knapsack {

    // O(2^n)
    int knapsack(int[] weights, int[] values, int limit, int size) {
        if (size == 0 || limit == 0) {
            return 0;
        }

        if (weights[size - 1] > limit) {
            return knapsack(weights, values, limit, size - 1);
        }

        return max(knapsack(weights, values, limit, size - 1),
                knapsack(weights, values, limit - weights[size - 1], size - 1) + values[size - 1]);
    }

    private int max(int a, int b) {
        return a > b ? a : b;
    }
}
