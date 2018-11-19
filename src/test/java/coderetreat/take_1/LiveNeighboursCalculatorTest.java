package coderetreat.take_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LiveNeighboursCalculatorTest {

    private LiveNeighboursCalculator liveNeighboursCalculator = new LiveNeighboursCalculator();

    @Test
    public void shouldGetLiveNeighboursWhereAllOfThemExist() {
        int[][] board = new int[3][3];
        board[0][0] = 1;
        board[1][0] = 1;
        board[2][1] = 1;
        int noOfLiveNeighbours = liveNeighboursCalculator.calculate(board, 1, 1);
        assertEquals(3, noOfLiveNeighbours);
    }

    @Test
    public void shouldGetLiveNeighboursWhereAllOfThemDoNotExist() {
        int[][] board = new int[3][3];
        board[0][0] = 1;
        board[1][1] = 1;
        int noOfLiveNeighbours = liveNeighboursCalculator.calculate(board, 1, 0);
        assertEquals(2, noOfLiveNeighbours);
    }
}
