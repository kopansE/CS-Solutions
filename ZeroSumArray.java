import java.io.*;
import java.util.*;

public class ZeroSumArray {
  public static boolean zeroSumArray(int[] nums){
    Set<Integer> sums =  new HashSet<Integer>();
    sums.add(0);
    int currentSum = 0;

    for(int num: nums){
      currentSum += num;
      if(sums.contains(currentSum)){
        return true;
      }
      sums.add(currentSum);
    }
      return false;
  }

  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();

    int[] array = new int[]{0,1,2,3,4,5,6,7,9,1};
    System.out.println(zeroSumArray(array));
  }
}