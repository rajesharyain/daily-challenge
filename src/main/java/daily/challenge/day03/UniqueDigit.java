package daily.challenge.day03;

import java.util.HashSet;
import java.util.Set;

public class UniqueDigit {

    public int findUnique(int[] nums) {
        if(nums.length < 1) return -1;
        Set<Integer> numSet = new HashSet<>();
        Set<Integer> removedSet = new HashSet<>();

        for (int num : nums) {
            if (!numSet.contains(num) && !removedSet.contains(num)) {
                numSet.add(num);
            } else if (numSet.contains(num)) {
                numSet.remove(num);
                removedSet.add(num);
            }
        }
        return numSet.isEmpty() ? -1 : numSet.iterator().next();
    }

}
