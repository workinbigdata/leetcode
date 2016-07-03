package ProductofArrayExceptSelf;

// Source : https://leetcode.com/problems/product-of-array-except-self/
// Author : Mark Lin
// Date   : 2016-07-03

/**********************************************************************************
 *
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 *
 * Solve it without division and in O(n).
 *
 * For example, given [1,2,3,4], return [24,12,8,6].
 *
 * Follow up:
 *
 * Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
 *
 **********************************************************************************/

public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int total = 1, numZero = 0;
        int[] ret = new int[nums.length];
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == 0) {
                numZero += 1;
            } else {
                total *= nums[i];
            }
        }

        if (numZero > 1) {
            return ret;
        } else if (numZero == 1){
            for(int i = 0; i < nums.length; i ++) {
                if (nums[i] == 0) {
                    ret[i] = total;
                } else {
                    ret[i] = 0;
                }
            }
        } else {
            for(int i = 0; i < nums.length; i ++) {
                ret[i] = total / nums[i];
            }
        }
        return ret;
    }
}
