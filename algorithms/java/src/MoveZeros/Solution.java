package MoveZeros;

// Source : https://leetcode.com/problems/move-zeroes/
// Author : Mark Lin
// Date   : 2016-06-19

/**********************************************************************************
 *
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 *
 * Note:
 *
 * 1. You must do this in-place without making a copy of the array.
 *
 * 2. Minimize the total number of operations.
 *
 *
 **********************************************************************************/
public class Solution {
    public void moveZeroes(int[] nums) {
        int readIndex = 0;
        int writeIndex = 0;

        while(readIndex < nums.length) {
            if(nums[readIndex] == 0) {
                readIndex++;
                continue;
            }

            if(readIndex != writeIndex) {
                nums[writeIndex] = nums[readIndex];
                nums[readIndex] = 0;
            }

            writeIndex++;
            readIndex++;
        }
    }
}
