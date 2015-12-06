package ThreeSum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// Source : https://leetcode.com/problems/3sum/
// Author : Mark Lin
// Date   : 2015-12-6

/**********************************************************************************
 *
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 *
 * Note:
 * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
 * The solution set must not contain duplicate triplets.
 *
 * For example, given array S = {-1 0 1 2 -1 -4},
 * A solution set is:
 * (-1, 0, 1)
 * (-1, -1, 2)
 *
 **********************************************************************************/

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new LinkedList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i ++) {
            if (i > 0 && nums[i] == nums[i-1])
                continue;
            int target = -nums[i];
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[j] + nums[k];
                if (sum == target) {
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j + 1< k && nums[j + 1] == nums[j])
                        j ++;
                    while (j < k - 1 && nums[k - 1] == nums[k])
                        k --;
                    j ++;
                    k --;
                } else if (sum > target) {
                    k --;
                } else {
                    j ++;
                }
            }
        }
        return list;
    }
}
