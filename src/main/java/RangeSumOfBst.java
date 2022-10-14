import basic.TreeNode;

public class RangeSumOfBst {
    public static void main(String[] args) {

    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        if (root == null) {
            return 0;
        }
        if (root.val < L) {
            sum += rangeSumBST(root.right, L, R);
        }
        if (root.val > R) {
            sum += rangeSumBST(root.left, L, R);
        }
        if (root.val >= L && root.val <= R) {
            sum += root.val;
            sum += rangeSumBST(root.left, L, R);
            sum += rangeSumBST(root.right, L, R);
        }
        return sum;
    }


}
// https://leetcode.cn/problems/Range-Sum-Of-Bst