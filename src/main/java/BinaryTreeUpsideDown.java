import basic.TreeNode;

public class BinaryTreeUpsideDown{
    private TreeNode res;
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t1.left = t2;
        t1.right = t3;
        BinaryTreeUpsideDown b = new BinaryTreeUpsideDown();
        System.out.println(b.upsideDownBinaryTree(t1).val);


    }

    public TreeNode upsideDownBinaryTree(TreeNode root) {
        dfs(root);
        return res;
    }

    void dfs(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        if(treeNode.left == null && treeNode.right == null){
            res = treeNode;
        }
        dfs(treeNode.left);
        if(treeNode.left != null){
            treeNode.left.right = treeNode;
            treeNode.left.left = treeNode.left;
            treeNode.left = null;
            treeNode.right = null;
        }
    }
}
// https://leetcode.cn/problems/Binary-Tree-Upside-Down