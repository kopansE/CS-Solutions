import java.util.Arrays;

public class MinimumWaitingTime {

    public static int minimumWaitingTime(int[] waitingTimes) {
        Arrays.sort(waitingTimes);

        int totalWaitingTime = 0;
        int currentWaitingTime = 0;

        for (int i = 0; i < waitingTimes.length - 1; i++) {
            currentWaitingTime += waitingTimes[i];
            totalWaitingTime += currentWaitingTime;
        }

        return totalWaitingTime;
    }

    public static void main(String[] args) {
        // Test cases
        int[] test1 = {100};
        int[] test2 = {100, 1}; 
        int[] test3 = {100, 1, 1}; // 3
        int[] test4 = {1, 2, 3,4,5}; //20 


        System.out.println("Minimum waiting time for [100]: " + minimumWaitingTime(test1)); // Output: 0
        System.out.println("Minimum waiting time for [100, 1]: " + minimumWaitingTime(test2)); // Output: 1
        System.out.println("Minimum waiting time for [100, 1, 1]: " + minimumWaitingTime(test3)); // Output: 3
        System.out.println("Minimum waiting time for [1, 2, 3, 4 ,5]: " + minimumWaitingTime(test4)); // Output: 20
    }
}
