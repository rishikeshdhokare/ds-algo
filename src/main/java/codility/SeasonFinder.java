package codility;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.min;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

class SeasonFinder {

    private static final String[] SEASONS = {"WINTER", "SPRING", "SUMMER", "AUTUMN"};

    String findSeason(int[] temperatures) {
        int size = temperatures.length / 4;
        List<Integer> tempList = stream(temperatures).boxed().collect(toList());
        List<List<Integer>> seasonWiseTemps = partitionIntoSeasonWiseTemperatures(size, tempList);
        return SEASONS[getSeasonIndex(seasonWiseTemps)];
    }

    private int getSeasonIndex(List<List<Integer>> seasonWiseTemps) {
        int maxDiff = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < seasonWiseTemps.size(); i++) {
            int tempMaxDiff = getLargestDifference(seasonWiseTemps.get(i));
            if (tempMaxDiff > maxDiff) {
                maxDiff = tempMaxDiff;
                index = i;
            }
        }
        return index;
    }

    private List<List<Integer>> partitionIntoSeasonWiseTemperatures(int size, List<Integer> tempList) {
        List<List<Integer>> seasonWiseTemps = new ArrayList<>();
        for (int i = 0; i < tempList.size(); i += size) {
            seasonWiseTemps.add(tempList.subList(i, min(i + size, tempList.size())));
        }
        return seasonWiseTemps;
    }

    private int getLargestDifference(List<Integer> temperatures) {
        temperatures.sort(Integer::compareTo);
        return temperatures.get(temperatures.size() - 1) - temperatures.get(0);
    }
}
