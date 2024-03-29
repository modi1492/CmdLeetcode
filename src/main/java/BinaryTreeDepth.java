import basic.TreeNode;

public class BinaryTreeDepth {
    public static void main(String[] args) {
        BinaryTreeDepth b = new BinaryTreeDepth();

    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}

// https://leetcode.cn/problems/Binary-Tree-Depth