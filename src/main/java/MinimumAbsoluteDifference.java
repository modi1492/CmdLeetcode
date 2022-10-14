import basic.TreeNode;

/**
 * 二叉搜索树的中序遍历是递增的
 */
public class MinimumAbsoluteDifference {
    int ans = Integer.MAX_VALUE;
    int pre = -1;

    public int getMinimumDifference(TreeNode root) {
        if (root != null && root.left != null) {
            getMinimumDifference(root.left);
        }
        if (root != null) {
            if (pre == -1) {
                pre = root.val;
            } else {
                ans = Math.min(Math.abs(root.val - pre), ans);
                pre = root.val;
            }
        }
        if (root != null && root.right != null) {
            getMinimumDifference(root.right);
        }
        return ans;
    }

    public int getMinimumDifference2(TreeNode root) {
        dfs(root);
        return ans;
    }

    void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            dfs(node.left);
        }

        if (pre == -1) {
            pre = node.val;
        } else {
            ans = Math.min(Math.abs(node.val - pre), ans);
            pre = node.val;
        }

        if (node.right != null) {
            dfs(node.right);
        }
    }
}
// https://leetcode.cn/problems/Minimum-Absolute-Difference