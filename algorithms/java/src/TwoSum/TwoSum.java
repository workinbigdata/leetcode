package TwoSum;

import java.util.Arrays;

// Source : https://leetcode.com/problems/two-sum/
// Author : Mark Lin
// Date   : 2015-12-5

/**********************************************************************************
 *
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned
 *
 * answers (both index1 and index2) are not zero-based.
 *
 * You may assume that each input would have exactly one solution.
 *
 * Input: numbers={2, 7, 11, 15}, target=9
 *
 * Output: index1=1, index2=2
 *
 **********************************************************************************/

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        int i = 0, j = sortedNums.length - 1;
        int idx1 = 0, idx2 = 0;
        while (i < j) {
            int sum = sortedNums[i] + sortedNums[j];
            if (sum == target) {
                for (int k = 0; k < nums.length; k ++) {
                    if (nums[k] == sortedNums[i]) {
                        idx1 = k;
                        break;
                    }

                }
                for (int k = 0; k < nums.length; k ++) {
                    if (nums[k] == sortedNums[j] && k != idx1) {
                        idx2 = k;
                        break;
                    }
                }
                if (idx1 > idx2) {
                    int temp = idx1;
                    idx1 = idx2;
                    idx2 = temp;
                }
                break;
            } else if (sum > target) {
                j --;
            } else {
                i ++;
            }
        }
        return new int[] {idx1 + 1, idx2 + 1};
    }
}
