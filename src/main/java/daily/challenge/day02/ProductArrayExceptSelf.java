package daily.challenge.day02;

import java.util.Arrays;

/**
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 */
public class ProductArrayExceptSelf {
    int[] productArray(int[] nums){
        if(nums.length <= 1) return nums;
        int product = 1;
        for(int num : nums){
            product = product * num;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = product / nums[i];
        }

        return nums;
    }

    /**
     * This method is without the division,
     * so we can prevent any Airthmatic exception whne division by zero
     * @param nums
     * @return
     */

    int[] productArrayWithoutDivision(int[] nums){
        if(nums.length <= 1) return nums;
        int[] result = new int[nums.length];
        int i = 0;
        while(i < nums.length) {
           result[i] =  leftProduct(nums, i) * rightProduct(nums, i+1);
           i++;
        }
        return result;
    }

    private int rightProduct(int[] nums, int start) {
        int product = 1;
        for (int i = start; i < nums.length; i++) {
            product *= nums[i];
        }
        return product;
    }

    private int leftProduct(int[] nums, int end) {
        int product = 1;
        for (int i = 0; i < end; i++) {
            product *= nums[i];
        }
        return product;
    }
}
