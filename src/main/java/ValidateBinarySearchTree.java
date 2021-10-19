import basic.TreeNode;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        ValidateBinarySearchTree v = new ValidateBinarySearchTree();
    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return false;
        }
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    boolean isValidBST(TreeNode treeNode, long min, long max) {
        if (treeNode == null) {
            return true;
        }
        if (treeNode.val <= min || treeNode.val >= max) {
            return false;
        }
        return isValidBST(treeNode.left, min, treeNode.val)
                && isValidBST(treeNode.right, treeNode.val, max);
    }
}
