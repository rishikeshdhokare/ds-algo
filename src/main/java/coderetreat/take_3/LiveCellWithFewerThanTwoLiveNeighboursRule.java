package coderetreat.take_3;

public class LiveCellWithFewerThanTwoLiveNeighboursRule implements Rule {

    @Override
    public boolean nextState(boolean currentState, int noOfLiveNeighbours) {
        return !(currentState && noOfLiveNeighbours < 2);
    }
}
