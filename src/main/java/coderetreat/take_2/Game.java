package coderetreat.take_2;

import java.util.stream.Collectors;

public class Game {

    private Universe universe;

    public Game(Universe universe) {
        this.universe = universe;
    }

    public Universe play() {
        for (Cell cell: universe.getCells()) {
            int noOfLiveNeighbours = findLiveNeighboursCount(cell);
            if(cell.isAlive() && noOfLiveNeighbours < 2) {
                cell.setAlive(false);
            }
        }
        universe.getCells().forEach(c -> c.setAlive(false));
        return universe;
    }

    private int findLiveNeighboursCount(Cell cell) {
        return universe.getCells().stream()
                .filter(c -> c.getX() == cell.getX() + 1 || c.getX() == cell.getX() - 1 ||
                             c.getY() == cell.getY() + 1 || c.getY() == cell.getY() - 1
                       )
                .filter(c -> c.isAlive())
                .collect(Collectors.toList())
                .size();
    }
}
