import basic.TreeNode;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return help(root) != -1;
    }

    /**
     * 返回平衡二叉树的深度 如果不是平衡二叉树则返回-1
     *
     * @param node
     * @return
     */
    int help(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = help(node.left);
        if (left == -1) {
            return -1;
        }
        int right = help(node.right);
        if (right == -1) {
            return -1;
        }
        if (Math.abs(left - right) >= 2) {
            return -1;
        } else {
            return Math.max(left, right) + 1;
        }
    }
}
// https://leetcode.cn/problems/Balanced-Binary-Tree