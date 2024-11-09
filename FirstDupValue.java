import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FirstDupValue {
    
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();

        int[] array = new int[]{0,1,2,3,4,5,6,7,9,1};
        System.out.println(firstDupValue1(array));
  }

    public static int firstDupValue1(int[] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
            if(nums[i]==nums[j])
                return j;
            }
        }
        return -1;
    }

    public static int firstDupValue1Ariel(int[] nums){
        int minimumSecondIndex = nums.length;
        for(int index1 = 0; index1 < nums.length; index1 ++){
            int value = nums[index1];
            for(int index2 = index1 + 1;index2 < nums.length; index2 ++){
            int valueToCompare = nums[index2];
            if(value == valueToCompare){
                minimumSecondIndex = Math.min(minimumSecondIndex, index2);
            }
            }
            if(minimumSecondIndex == nums.length){
            return -1;
            }
            return nums[minimumSecondIndex];
        }
  
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
            if(nums[i]==nums[j])
                return i;
            }
        }
        return -1;
        }

    // Solution II,  time = O(n)  | Space = O(n)
    public static int firstDupValue2(int[] nums){
        Set<Integer> set =  new HashSet<Integer>();
        int indexCounter=0;
        for(int number : nums){
            if(set.contains(number))
            return indexCounter;
            else{
            set.add(number);
            indexCounter++;
            }
        }
        return -1;
    }

    public static int firstDupValue2Ariel(int[] array){
        Set<Integer> seen =  new HashSet<Integer>();
        for(int value : array){
            if(seen.contains(value)) return value;
            seen.add(value);
        }
        return -1;
    }


    // Solution III, time = O(n)  | Space = O(1)
    public static int firstDupValue3(int[] array){
        for(int value: array){
            int absValue = Math.abs(value);
            if(array[absValue - 1] < 0) return absValue;
            array[absValue - 1] *= -1;
        }
        return -1;
    }
}
