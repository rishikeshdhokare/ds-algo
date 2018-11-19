package coderetreat.take_1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameTest {

    @Test
    public void shouldPlayOneIterationOfGame() {
        //given
        List<List<Integer>> initialBoard = new ArrayList<>();
        initialBoard.add(Arrays.asList(0, 0, 0, 0));
        initialBoard.add(Arrays.asList(0, 0, 1, 0));
        initialBoard.add(Arrays.asList(0, 0, 0, 0));
        initialBoard.add(Arrays.asList(0, 0, 0, 0));

        Game game = new Game(initialBoard);

        //when
        List<List<Integer>> updatedBoard = game.play();

        //then
    }
}
