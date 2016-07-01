package FindTheDuplicateNumber;

// Source : https://leetcode.com/problems/find-the-duplicate-number/
// Author : Mark Lin
// Date   : 2016-07-01

/**********************************************************************************
 *
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
 *
 * prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.
 *
 * Note:
 * You must not modify the array (assume the array is read only).
 *
 * You must use only constant, O(1) extra space.
 *
 * Your runtime complexity should be less than O(n2).
 *
 * There is only one duplicate number in the array, but it could be repeated more than once.
 *
 **********************************************************************************/

public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int l = 1, r = nums.length;
        while (l < r) {
            int lCount = 0, midCount = 0, rCount = 0;
            int mid = l + (r - l) / 2;
            for (int e : nums) {
                if (e == mid) {
                    midCount ++;
                } else if (e >= l && e < mid) {
                    lCount ++;
                } else if (e > mid && e <= r) {
                    rCount ++;
                }
            }
            if (midCount > 1) {
                return mid;
            } else if (lCount > (mid - l)) {
                r = mid - 1;
            } else if (rCount > (r - mid)) {
                l = mid + 1;
            } else {
                l = l + 1;
                r = r - 1;
            }
        }
        return l;
    }
}
