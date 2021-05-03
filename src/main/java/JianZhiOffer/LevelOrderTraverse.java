package JianZhiOffer;

import basic.TreeNode;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/ 剑指 Offer 32 - I.
 * 从上到下打印二叉树
 */
public class LevelOrderTraverse {
    public static void main(String[] args) {}

    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<Integer> lst = new ArrayList<>();

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode poll = queue.poll();
                lst.add(poll.val);
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
                size--;
            }
        }
        int[] ans = new int[lst.size()];
        for (int i = 0; i < lst.size(); i++) {
            ans[i] = lst.get(i);
        }
        return ans;
    }
}
