import basic.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/ 剑指 Offer 54.
 * 二叉搜索树的第k大节点
 */
public class BinaryTreeKthLargest {
    public static void main(String[] args) {
        BinaryTreeKthLargest b = new BinaryTreeKthLargest();
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        t3.left = t1;
        t3.right = t4;
        t1.right = t2;
        System.out.println(b.kthLargest(t3,1));
    }

    public int kthLargest(TreeNode root, int k) {
        List<Integer> lst = new ArrayList<>();
        help(root, lst);
        return lst.get(k - 1);
    }

    void help(TreeNode treeNode, List<Integer> lst) {
        if (treeNode == null) {
            return;
        }
        help(treeNode.right, lst);
        lst.add(treeNode.val);
        help(treeNode.left, lst);
    }
}



// https://leetcode.cn/problems/Binary-Tree-Kth-Largest