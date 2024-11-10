import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class mergeIntervals {

    public static LinkedList<int[]> mergeOverlappingInterval(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        LinkedList<int[]> finalInterval = new LinkedList<>();

        for (int[] interval : intervals) {
            if (finalInterval.isEmpty() || finalInterval.getLast()[1] < interval[0]) {
                finalInterval.add(interval);
            } else {
                finalInterval.getLast()[1] = Math.max(finalInterval.getLast()[1], interval[1]);
            }
        }
        return finalInterval;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {3, 5}, {4, 7}, {6, 8}, {9, 10}};
        LinkedList<int[]> result = mergeOverlappingInterval(intervals);

        // Print the merged intervals
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }

    public static int[][] mergeOverlappingInterval1(int[][] intervals) {

    int[][] sortedIntervals = intervals.clone();
    Arrays.sort(sortedIntervals, (a, b) -> Integer.compare(a[0], b[0]));

    List<int[]> mergeIntervals = new ArrayList<int[]>();
    int[] currentInterval = sortedIntervals[0];
    mergeIntervals.add(currentInterval);

    for (int[] nextInterval : sortedIntervals) {
      int currentIntervalEnd = currentInterval[1];
      int nextIntervalStart = nextInterval[0];
      int nextIntervalEnd = nextInterval[1];

      if (currentIntervalEnd >= nextIntervalStart) {
        currentInterval[1] = Math.max(currentIntervalEnd, nextIntervalEnd);
      } else {
        currentInterval = nextInterval;
        mergeIntervals.add(currentInterval);
      }
    }
    return mergeIntervals.toArray(new int[mergeIntervals.size()][]);
  }
}
