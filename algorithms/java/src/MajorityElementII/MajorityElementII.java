package MajorityElementII;

import java.util.ArrayList;
import java.util.List;

// Source : https://leetcode.com/problems/majority-element-ii/
// Author : Mark Lin
// Date   : 2016-07-11

/**********************************************************************************
 *
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times. The algorithm should run in linear time and in O(1) space.
 *
 * Hint:
 *
 * How many majority elements could it possibly have?
 *
 **********************************************************************************/

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        if (nums.length == 0) return list;
        if (nums.length == 1) {
            list.add(nums[0]);
            return list;
        }
        int num1 = nums[0], num2 = nums[0];
        int count1 = 0, count2 = 0;
        for (int i : nums) {
            if (i == num1) {
                count1 ++;
            } else if (i == num2) {
                count2 ++;
            } else if (count1 == 0) {
                num1 = i;
                count1 = 1;
            } else if (count2 == 0) {
                num2 = i;
                count2 = 1;
            } else {
                count1 --;
                count2 --;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i : nums) {
            if (i == num1) {
                count1 ++;
            } else if (i == num2) {
                count2 ++;
            }
        }
        if (count1 > nums.length / 3)
            list.add(num1);
        if (count2 > nums.length / 3)
            list.add(num2);
        return list;
    }
}
