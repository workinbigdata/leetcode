package moveZeros;

/**
 * Created by linchen on 16-6-19.
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = new int[] {0, 1, 0, 3, 12};
        solution.moveZeroes(a);
        for (int i = 0; i < a.length; i ++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");
    }
}
