package FindTheDuplicateNumber;

/**
 * Created by linchen on 16-6-30.
 */
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
