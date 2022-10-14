import basic.TreeNode;

public class UnivaluedBinaryTree {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(1);
        t1.left = t2;
        t1.right = t3;
        UnivaluedBinaryTree u = new UnivaluedBinaryTree();
        System.out.println(u.isUnivalTree(t1));
    }

    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return false;
        }
        return help(root, root.val);
    }

    private boolean help(TreeNode treeNode, int val) {
        if (treeNode == null) {
            return true;
        }
        if (treeNode.val != val) {
            return false;
        }
        return help(treeNode.left, val) && help(treeNode.right, val);
    }
}

// https://leetcode.cn/problems/Univalued-Binary-Tree