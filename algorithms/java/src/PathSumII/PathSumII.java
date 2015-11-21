package PathSumII;

// Source : https://leetcode.com/problems/path-sum-ii/
// Author : Mark Lin
// Date   : 2015-11-21

import java.util.LinkedList;
import java.util.List;

/**********************************************************************************
 *
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
 *
 * For example:
 *
 * Given the below binary tree and sum = 22,
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \    / \
 *         7    2  5   1
 *
 * return
 * [
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 *
 **********************************************************************************/

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ret = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        pathSumHelper(root, sum , list, ret);
        return ret;
    }

    private void pathSumHelper(TreeNode root, int sum, List<Integer> list, List<List<Integer>> ret) {
        if (root != null) {
            list.add(root.val);
            if (sum - root.val == 0 && root.left == null && root.right == null)
                ret.add(new LinkedList(list));
            pathSumHelper(root.left, sum - root.val, list, ret);
            pathSumHelper(root.right, sum - root.val, list, ret);
            list.remove(list.size() - 1);
        }
    }
}
