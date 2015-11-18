package SerializeandDeserializeBinaryTree;

/**
 * Created by Chen on 2015/11/18.
 */
public class SerializeandDeserializeBinaryTreeTest {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        /*TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        root.left = a;
        root.right = b;
        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(5);
        b.left = c;
        b.right = d;*/
        SerializeandDeserializeBinaryTree codec = new SerializeandDeserializeBinaryTree();
        String data = codec.serialize(root);
        System.out.println(data);
        codec.deserialize(data);
    }
}
