package coderetreat.take_1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NextStatePredictorTest {

    private NextStatePredictor predictor = new NextStatePredictor();

    @Test
    public void liveCellWithFewerThanTwoLiveNeighboursShouldDie() {
        assertFalse(predictor.predict(true, 0));
        assertFalse(predictor.predict(true, 1));
    }

    @Test
    public void liveCellWithTwoOrThreeLiveNeighboursShouldContinueToLive() {
        assertTrue(predictor.predict(true, 2));
        assertTrue(predictor.predict(true, 3));
    }

    @Test
    public void liveCellWithMoreThanThreeLiveNeighboursShouldDie() {
        assertFalse(predictor.predict(true, 4));
    }

    @Test
    public void deadCellWithExactlyThreeLiveNeighboursBecomesLiveAgain() {
         assertTrue(predictor.predict(false, 3));
    }

    @Test
    public void deadCellWithTwoLiveNeighboursWillContinueToBeDead() {
        assertFalse(predictor.predict(false, 2));
    }
}
