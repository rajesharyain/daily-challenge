package daily.challenge.day01;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem statement:
 * ------------------------------------------------------------------------
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 * Bonus: Can you do this in one pass?
 * ------------------------------------------------------------------------
 */
public class TwoSum {
    Map<Integer, Integer> map;

    boolean sum(int[] nums, int k) {
        map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = k - nums[i];
            if(map.containsKey(diff)) {
               return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

}
