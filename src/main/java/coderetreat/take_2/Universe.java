package coderetreat.take_2;

import java.util.List;

public class Universe {

    private List<Cell> cells;

    public Universe(List<Cell> cells) {
        this.cells = cells;
    }

    public List<Cell> getCells() {
        return cells;
    }
}
