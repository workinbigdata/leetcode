package MissingNumber;

// Source : https://leetcode.com/problems/missing-number/
// Author : Mark Lin
// Date   : 2015-12-4

/**********************************************************************************
 *
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 *
 * For example,
 * Given nums = [0, 1, 3] return 2.
 *
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 *
 **********************************************************************************/

public class MissingNumber {
    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i ++) {
            while (nums[i] != i) {
                if (nums[i] < nums.length) {
                    int temp = nums[nums[i]];
                    nums[nums[i]] = nums[i];
                    nums[i] = temp;
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}
