import basic.TreeNode;

import java.util.*;

public class BinaryTreePostorderTraversal {
    public static void main(String[] args) {
        BinaryTreePostorderTraversal b = new BinaryTreePostorderTraversal();
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t1.right = t2;
        t2.left = t3;
        System.out.println(b.postorderTraversal1(t1));
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        help(root, lst);
        return lst;
    }

    void help(TreeNode root, List<Integer> lst) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            help(root.left, lst);
        }
        if (root.right != null) {
            help(root.right, lst);
        }
        lst.add(root.val);
    }

    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }

        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode prev = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.right == null || root.right == prev) {
                res.add(root.val);
                prev = root;
                root = null;
            } else {
                stack.push(root);
                root = root.right;
            }
        }
        return res;

    }
}

// https://leetcode.cn/problems/Binary-Tree-Postorder-Traversal