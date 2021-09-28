import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {}

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> lst = new ArrayList<>();
        if (root == null) {
            return new ArrayList<>();
        }
        List<String> left = binaryTreePaths(root.left);
        List<String> right = binaryTreePaths(root.right);
        if (left.size() == 0 && right.size() == 0) {
            List<String> res = new ArrayList<>();
            res.add(String.valueOf(root.val));
            return res;
        }

        for (String item : left) {
            lst.add(root.val + "->" + item);
        }
        for (String item : right) {
            lst.add(root.val + "->" + item);
        }
        return lst;
    }
}
