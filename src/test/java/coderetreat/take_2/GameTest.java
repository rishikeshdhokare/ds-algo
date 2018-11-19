package coderetreat.take_2;

import coderetreat.take_2.Cell;
import coderetreat.take_2.Game;
import coderetreat.take_2.Universe;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GameTest {

    @Test
    public void shouldGetSameUniverseWhen() {
        //given
        Universe universe = new Universe(new ArrayList<>());

        //when
        Game game = new Game(universe);
        Universe updatedUniverse = game.play();

        //then
        Assert.assertEquals(universe, updatedUniverse);
    }

    @Test
    public void liveCellWithFewerThanTwoLiveNeighboursDies() {
        //given
        List<Cell> cells = new ArrayList<>();
        cells.add(new Cell(false, 0, 0));
        cells.add(new Cell(false, 0, 1));
        cells.add(new Cell(false, 0, 2));
        cells.add(new Cell(false, 1, 0));
        cells.add(new Cell(true, 1, 1));
        cells.add(new Cell(false, 1, 2));
        cells.add(new Cell(false, 2, 0));
        cells.add(new Cell(false, 2, 1));
        cells.add(new Cell(false, 2, 2));
        Universe universe = new Universe(cells);

        //when
        Game game = new Game(universe);
        Universe updatedUniverse = game.play();

        //then
        List<Cell> updatedCells = updatedUniverse.getCells();
        updatedCells.forEach(c -> assertFalse(c.isAlive()));
    }

    @Test
    public void liveCellWIthTwoLiveNeighboursContinuesToLive() {
        //given
        List<Cell> cells = new ArrayList<>();
        cells.add(new Cell(false, 0, 0));
        cells.add(new Cell(false, 0, 1));
        cells.add(new Cell(false, 0, 2));
        cells.add(new Cell(true, 1, 0));
        cells.add(new Cell(true, 1, 1));
        cells.add(new Cell(false, 1, 2));
        cells.add(new Cell(false, 2, 0));
        cells.add(new Cell(false, 2, 1));
        cells.add(new Cell(true, 2, 2));
        Universe universe = new Universe(cells);

        //when
        Game game = new Game(universe);
        Universe updatedUniverse = game.play();

        //then
        List<Cell> updatedCells = updatedUniverse.getCells();

        Cell cell = updatedCells.stream().filter(c -> c.getX() == 1 & c.getY() == 1).findFirst().get();
        assertTrue(cell.isAlive());
    }
}
