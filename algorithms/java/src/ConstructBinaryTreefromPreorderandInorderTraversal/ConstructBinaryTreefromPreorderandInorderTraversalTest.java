package ConstructBinaryTreefromPreorderandInorderTraversal;

/**
 * Created by Chen on 2015/11/25.
 */
public class ConstructBinaryTreefromPreorderandInorderTraversalTest {
    public static void main(String[] args) {
        // int[] preorder = {1, 2, 4, 5, 3, 6};
        // int[] inorder = {4, 2, 5, 1, 3, 6};
        int[] preorder = {1, 2, 3};
        int[] inorder = {2, 3, 1};
        ConstructBinaryTreefromPreorderandInorderTraversal construct = new ConstructBinaryTreefromPreorderandInorderTraversal();
        construct.buildTree(preorder, inorder);
    }
}
