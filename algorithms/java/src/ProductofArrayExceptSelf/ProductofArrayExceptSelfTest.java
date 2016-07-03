package ProductofArrayExceptSelf;

/**
 * Created by linchen on 16-7-3.
 */
public class ProductofArrayExceptSelfTest {
    public static void main(String[] args) {
        int[] nums = {4, 3, 1, 4, 2};
        ProductofArrayExceptSelf solution = new ProductofArrayExceptSelf();
        int[] ret = solution.productExceptSelf(nums);
        for (int e : ret) {
            System.out.print(e + " ");
        }
        System.out.print("\n");
    }
}
