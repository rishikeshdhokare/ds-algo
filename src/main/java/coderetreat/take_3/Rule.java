package coderetreat.take_3;

public interface Rule {
    boolean nextState(boolean currentState, int noOfLiveNeighbours);
}
