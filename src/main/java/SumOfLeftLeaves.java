import basic.TreeNode;

public class SumOfLeftLeaves {
    public static void main(String[] args) {
        SumOfLeftLeaves s = new SumOfLeftLeaves();
        TreeNode t3 = new TreeNode(3);
        TreeNode t9 = new TreeNode(9);
        TreeNode t20 = new TreeNode(20);
        TreeNode t15 = new TreeNode(15);
        TreeNode t7 = new TreeNode(17);
        t3.left = t9;
        t3.right = t20;
        t20.left = t15;
        t20.right = t7;
        System.out.println(s.sumOfLeftLeaves(t3));
    }

    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root);
        return sum;
    }

    void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            dfs(node.left);
        }

        if (node.left != null && node.left.left == null && node.left.right == null) {
            sum += node.left.val;
        }

        if (node.right != null) {
            dfs(node.right);
        }
    }
}