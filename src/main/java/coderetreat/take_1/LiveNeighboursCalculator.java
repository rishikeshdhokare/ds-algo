package coderetreat.take_1;

public class LiveNeighboursCalculator {

    public int calculate(int[][] board, int rowIndex, int colIndex) {
        int noOfLiveNeighbours = 0;
        for (int i = rowIndex - 1; i <= rowIndex + 1; i++) {
            for (int j = colIndex - 1; j <= colIndex + 1; j++) {
                if (isValidCell(rowIndex, colIndex, i, j) && board[i][j] == 1) {
                    noOfLiveNeighbours++;
                }
            }
        }
        return noOfLiveNeighbours;
    }

    private boolean isValidCell(int rowIndex, int colIndex, int i, int j) {
        boolean currentCell = i == rowIndex && j == colIndex;
        boolean validRowIndex = i < 0 || i > 2;
        boolean validColIndex = j < 0 || j > 2;
        return !(currentCell || validRowIndex || validColIndex);
    }
}
