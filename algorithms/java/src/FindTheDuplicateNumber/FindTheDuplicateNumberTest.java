package FindTheDuplicateNumber;

/**
 * Created by linchen on 16-6-30.
 */
public class FindTheDuplicateNumberTest {
    public static void main(String[] args) {
        int[] nums = {4, 3, 1, 4, 2};
        FindTheDuplicateNumber solution = new FindTheDuplicateNumber();
        int ret = solution.findDuplicate(nums);
        System.out.println(ret);
    }
}
