/**
 * //236. 二叉树的最近公共祖先
 */

import basic.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LowestCommonAncestorOfABinaryTree {

    Map<Integer, TreeNode> map = new HashMap<>();
    Set<TreeNode> visitedNode = new HashSet<>();

    /**
     * 获取子节点到父节点map
     *
     * @param node
     */
    void dfs(TreeNode node) {
        if (node.left != null) {
            map.put(node.left.val, node);
            dfs(node.left);
        }
        if (node.right != null) {
            map.put(node.right.val, node);
            dfs(node.right);
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root);
        while (p != null) {
            visitedNode.add(p);
            p = map.get(p.val);
        }
        while (q != null) {
            if (visitedNode.contains(q)) {
                return q;
            }
            q = map.get(q.val);
        }
        return null;
    }


    public static void main(String[] args) {
        LowestCommonAncestorOfABinaryTree l = new LowestCommonAncestorOfABinaryTree();
        TreeNode t3 = new TreeNode(3);
        TreeNode t5 = new TreeNode(5);
        TreeNode t1 = new TreeNode(1);
        TreeNode t6 = new TreeNode(6);
        TreeNode t2 = new TreeNode(2);
        TreeNode t0 = new TreeNode(0);
        TreeNode t8 = new TreeNode(8);
        TreeNode t7 = new TreeNode(7);
        TreeNode t4 = new TreeNode(4);
        t3.left = t5;t3.right = t1;
        t5.left = t6;t5.right = t2;
        t1.left = t0; t1.right = t8;
        t2.left = t7; t2.right = t4;
        System.out.println(l.lowestCommonAncestor(t3,t5,t1).val);
    }
}
// https://leetcode.cn/problems/Lowest-Common-Ancestor-Of-ABinary-Tree