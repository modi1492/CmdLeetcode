import basic.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {

    }

    List<Integer> lst = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null && root.left != null) {
            inorderTraversal(root.left);
        }
        if (root != null) {
            lst.add(root.val);
        }
        if (root != null && root.right != null) {
            inorderTraversal(root.right);
        }
        return lst;
    }
}