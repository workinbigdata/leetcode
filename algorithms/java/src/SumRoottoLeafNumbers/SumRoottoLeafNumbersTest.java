package SumRoottoLeafNumbers;

/**
 * Created by Chen on 2015/11/17.
 */
public class SumRoottoLeafNumbersTest {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        root.left = a;
        root.right = b;
        SumRoottoLeafNumbers srtln = new SumRoottoLeafNumbers();
        System.out.println(srtln.sumNumbers(root));
    }
}
