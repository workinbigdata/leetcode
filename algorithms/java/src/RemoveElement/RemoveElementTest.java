package RemoveElement;

/**
 * Created by Mark Lin on 2015/12/2.
 */
public class RemoveElementTest {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 5, 6};
        RemoveElement remove = new RemoveElement();
        System.out.println(remove.removeElement(nums, 4));
    }
}
