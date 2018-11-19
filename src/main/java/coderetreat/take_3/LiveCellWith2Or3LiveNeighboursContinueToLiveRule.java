package coderetreat.take_3;

public class LiveCellWith2Or3LiveNeighboursContinueToLiveRule implements Rule {

    @Override
    public boolean nextState(boolean currentState, int noOfLiveNeighbours) {
        return currentState && (noOfLiveNeighbours == 2 || noOfLiveNeighbours == 3);
    }
}
