import basic.TreeNode;

/**
 * 700. 二叉搜索树中的搜索
 */
public class SearchInABinarySearchTree {
    public static void main(String[] args) {

    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        } else if (root.val < val) {
            return searchBST(root.right, val);
        } else {
            return searchBST(root.left, val);
        }
    }
}
// https://leetcode.cn/problems/Search-In-ABinary-Search-Tree