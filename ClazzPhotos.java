import java.util.Arrays;

public class ClazzPhotos {

    public static boolean canTakeClassPhoto(int[] redShirts, int[] blueShirts) {
        Arrays.sort(redShirts);
        Arrays.sort(blueShirts);

        String teamInFront = redShirts[0] < blueShirts[0] ? "RED" : "BLUE";

        // Step 3: Check if all students in the front row are shorter than the back row
        for (int i = 0; i < redShirts.length; i++) {
            if ("RED".equals(teamInFront)) {
                if (redShirts[i] >= blueShirts[i]) { // if red in front then each red player must be shorter
                    return false;
                }
            } 
            else {
                if (blueShirts[i] >= redShirts[i]) { // same for blue
                    return false;
                }
            }
        }
        // If all checks passed, return true
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        int[] redShirts1 = {5, 8, 1, 3, 4};
        int[] blueShirts1 = {6, 9, 2, 4, 5};
        System.out.println("Can take class photo: " + canTakeClassPhoto(redShirts1, blueShirts1)); // Output: true

        int[] redShirts2 = {5, 8, 1, 3, 4};
        int[] blueShirts2 = {6, 2, 4, 5, 7};
        System.out.println("Can take class photo: " + canTakeClassPhoto(redShirts2, blueShirts2)); // Output: false (arrays of different sizes)

        int[] redShirts3 = {6, 9, 2, 4, 5};
        int[] blueShirts3 = {5, 8, 1, 3, 4};
        System.out.println("Can take class photo: " + canTakeClassPhoto(redShirts3, blueShirts3)); // Output: true
    }
}
