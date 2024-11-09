import java.util.Arrays;

public class NonConstructibleChange {
    public static int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins); 
        int currentChange = 0;

        for (int coin : coins) {
            if (coin > currentChange + 1) {
                return currentChange + 1;
            }
            currentChange += coin;
        }

        return currentChange + 1;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] coins1 = {5, 7, 1, 1, 2, 3, 22};
        System.out.println("Minimum non-constructible change: " + nonConstructibleChange(coins1)); // Expected output: 20

        // Test case 2
        int[] coins2 = {1, 1, 1, 1, 1};
        System.out.println("Minimum non-constructible change: " + nonConstructibleChange(coins2)); // Expected output: 6

        // Test case 3
        int[] coins3 = {1, 2, 5};
        System.out.println("Minimum non-constructible change: " + nonConstructibleChange(coins3)); // Expected output: 4

        // Test case 4
        int[] coins4 = {1, 1, 1, 1, 3};
        System.out.println("Minimum non-constructible change: " + nonConstructibleChange(coins4)); // Expected output: 8

        // Test case 5 (edge case with no coins)
        int[] coins5 = {};
        System.out.println("Minimum non-constructible change: " + nonConstructibleChange(coins5)); // Expected output: 1
    }
}
