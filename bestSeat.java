public class bestSeat {
    public static int bestSeat1(int[] seats) {
        int bestSeat = -1;
        int maxSpace = 0;
    
        int left = 0;
    
        while (left < seats.length) {
          int right = left + 1;
          while (right < seats.length && seats[right] == 0) {
            right++;
          }
    
          int avilableSpace = right - left - 1;
          if (avilableSpace > maxSpace) {
            bestSeat = (left + right) / 2;
            maxSpace = avilableSpace;
          }
          left = right;
        }
        return bestSeat;
      }

      public static int bestSeat(int[] seats) {
        int bestSeat = -1;
        int maxSpace = 0;
        int currentSpace = 0;
        int left = -1;
    
        for (int currentSeat = 0; currentSeat < seats.length; currentSeat++) {
            if (seats[currentSeat] == 0) {
                if (currentSpace == 0) {
                    left = currentSeat;
                }
                currentSpace++;
            } else {
                if (currentSpace > maxSpace) {
                    maxSpace = currentSpace;
                    bestSeat = left + currentSpace / 2;
                }
                currentSpace = 0; 
            }
        }
    
        if (currentSpace > maxSpace) {
            bestSeat = left + currentSpace / 2;
        }
    
        return bestSeat;
    }
    
}
