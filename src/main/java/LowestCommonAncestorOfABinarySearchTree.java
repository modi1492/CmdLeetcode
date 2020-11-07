import basic.TreeNode;

public class LowestCommonAncestorOfABinarySearchTree {
    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode small = p.val > q.val ? q : p;
        TreeNode big = p.val > q.val ? p : q;
        if (root.val >= small.val && root.val <= big.val) {
            return root;
        }
        if (root.val > big.val) {
            return lowestCommonAncestor(root.left, small, big);
        }
        return lowestCommonAncestor(root.right, small, big);
    }
}