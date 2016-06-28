package RotateArray;

/**
 * Created by linchen on 16-6-28.
 */
public class RotateArrayTest {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        RotateArray ra = new RotateArray();
        ra.rotate(nums, 3);
        for (int e : nums) {
            System.out.print(e + " ");
        }
        System.out.print("\n");
    }
}
