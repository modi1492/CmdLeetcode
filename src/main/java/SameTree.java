import basic.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree {
    public static void main(String[] args) {

    }

    /**
     * 层序遍历比较每个node的value知否相等
     *
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null) {
            return false;
        }
        if (q == null) {
            return false;
        }
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }


}
// https://leetcode.cn/problems/Same-Tree