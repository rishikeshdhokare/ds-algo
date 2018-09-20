package codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeasonFinderTest {

    private SeasonFinder seasonFinder = new SeasonFinder();

    @Test
    public void shouldFindSeason() {
        int[] temperaturesSet1 = new int[]{-3, -14, -5, 7, 8, 42, 8, 3};
        assertEquals("SUMMER", seasonFinder.findSeason(temperaturesSet1));

        int[] temperaturesSet2 = new int[]{2, -3, 3, 1, 10, 8, 2, 5, 13, -5, 3, 18};
        assertEquals("AUTUMN", seasonFinder.findSeason(temperaturesSet2));
    }
}