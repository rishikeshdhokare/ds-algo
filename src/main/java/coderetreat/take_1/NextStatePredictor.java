package coderetreat.take_1;

public class NextStatePredictor {
    public boolean predict(boolean isAlive, int noOfLiveNeighours) {
        return (isAlive && noOfLiveNeighours == 2) || noOfLiveNeighours == 3;
    }
}
