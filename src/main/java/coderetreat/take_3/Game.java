package coderetreat.take_3;

import rules.Rule;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Game {

    private Universe universe;

    public Game(Universe universe) {
        this.universe = universe;
    }

    public Universe play(List<Rule> rules) {
        List<Cell> updatedCells = new ArrayList<>();
        for (Cell cell : universe.getCells()) {
            boolean updatedState = cell.isAlive();
            for (Rule rule : rules) {
                updatedState = rule.nextState(cell.isAlive(), findNoOfLiveNeighbours(cell.getX(), cell.getY()));
            }
            updatedCells.add(new Cell(updatedState, cell.getX(), cell.getY()));
        }
        return new Universe(updatedCells);
    }

    private int findNoOfLiveNeighbours(int x, int y) {
        return universe.getCells().stream().filter(cell -> ((cell.getX() + 1 == x) || (cell.getX() - 1 == x)) &&
                                                     ((cell.getY() + 1 == y) || (cell.getY() - 1 == y)))
                                  .filter(cell -> cell.isAlive())
                .collect(Collectors.toList())
                .size();
    }
}
