import basic.TreeNode;

import java.util.Stack;

public class TwoSumBsts {
    public static void main(String[] args) {

    }

    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root1;
        while (p != null || !stack.isEmpty()) {
            while (p != null) {
                stack.push(p);
                if (findNumberFromBST(root2, target - p.val)) {
                    return true;
                }
                p = p.left;
            }
            if (!stack.isEmpty()) {
                TreeNode tmp = stack.pop();
                p = tmp.right;
            }
        }
        return false;
    }


    boolean findNumberFromBST(TreeNode root, int target) {
        if (root == null) {
            return false;
        }
        if (root.val == target) {
            return true;
        } else if (root.val > target) {
            return findNumberFromBST(root.left, target);
        } else {
            return findNumberFromBST(root.right, target);
        }
    }

    public boolean twoSumBSTs1(TreeNode root1, TreeNode root2, int target) {
        if (root1 == null) {
            return false;
        }
        return findNumberFromBST(root2, target - root1.val) ||
                twoSumBSTs1(root1.left, root2, target) ||
                twoSumBSTs1(root1.right, root2, target );
    }
}
// https://leetcode.cn/problems/Two-Sum-Bsts