package coderetreat.take_3;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class GameTest {

    private List<Rule> RULES = Arrays.asList(new LiveCellWithFewerThanTwoLiveNeighboursRule(), new LiveCellWith2Or3LiveNeighboursContinueToLiveRule());

    @Test
    public void liveCellWithFewerThanTwoLiveNeighboursShouldDie() {
        //given
        List<Cell> cells = Arrays.asList(new Cell(true, 0, 0));
        Universe universe = new Universe(cells);

        //when
        Game game = new Game(universe);
        Universe updatedUniverse = game.play(RULES);

        //then
        List<Cell> updatedCells = updatedUniverse.getCells();
        updatedCells.forEach(c -> assertFalse(c.isAlive()));
    }

    @Test
    public void liveCellWithTwoOrThreeLiveNeighboursShouldContinueToLive() {
        //given
        List<Cell> cells = Arrays.asList(new Cell(true, 0, 0),
                                   new Cell(true, 1, 0),
                                   new Cell(true, 0, 1));
        Universe universe = new Universe(cells);

        //when
        Game game = new Game(universe);
        Universe updatedUniverse = game.play(RULES);

        //then
        List<Cell> updatedCells = updatedUniverse.getCells();
        updatedCells.forEach(c -> assertTrue(c.isAlive()));
    }
}
