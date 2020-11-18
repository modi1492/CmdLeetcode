import basic.TreeNode;

public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (sameTree(s, t)) {
            return true;
        }
        if (s != null) {
            return isSubtree(s.left, t) || isSubtree(s.right, t);
        }
        return false;
    }


    private boolean sameTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null) {
            return false;
        }
        if (t == null) {
            return false;
        }
        return s.val == t.val && sameTree(s.left, t.left) && sameTree(s.right, t.right);
    }
}