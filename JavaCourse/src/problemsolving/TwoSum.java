package problemsolving;

import java.util.HashSet;
import java.util.Set;

/**
 * DSA problem: HashSet
 * Problem: Given an array of integers nums and an integer target, 
 * return boolean that add up to target.
 * */
public class TwoSum {
	
	//hashset 2 , 7
	
    public static boolean twoSum(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();//created set object
        for (int i = 0; i < nums.length; i++) { //iterating over integer array
            int complement = target - nums[i]; // target = 13 i=2 value=11 complement=2
            if (seen.contains(complement)) { //hashset contains method checking the value in the set in O(1) time
                return true;
            }
            seen.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
    	//indices    0   1  2    3
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        /**
         * target = 13
         * 
         * i=0 --- 2 13-2 = 11 --- need to find the value 11
         * 
         * 
         * */
        
        
        
        boolean result = twoSum(nums, target);
        if(result)
        	System.out.println("Two values are present in array which sums to " + target); // Output: Indices: 2, 7
        else
        	System.out.println("Two values are NOT present in array which sums to " + target); // Output: Indices: 2, 7
    }
}
