package ConstructBinaryTreefromInorderandPostorderTraversal;

/**
 * Created by Chen on 2015/11/26.
 */
public class ConstructBinaryTreefromInorderandPostorderTraversalTest {
    public static void main(String[] args) {
        int[] inorder = {1, 2};
        int[] postorder = {2, 1};
        ConstructBinaryTreefromInorderandPostorderTraversal construct = new ConstructBinaryTreefromInorderandPostorderTraversal();
        construct.buildTree(inorder, postorder);
    }
}
