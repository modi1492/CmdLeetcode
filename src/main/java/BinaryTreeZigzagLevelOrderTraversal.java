import basic.TreeNode;

import java.util.*;

/** https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/ 103. 二叉树的锯齿形层序遍历 */
public class BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String[] args) {
        //
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        System.out.println(lst);
        Collections.reverse(lst);
        System.out.println(lst);
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        List<List<Integer>> ans = new ArrayList<>();
        boolean flag = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> row = new ArrayList<>();
            // 将行内元素弹出 并且将下一行元素入队
            while (size > 0) {
                TreeNode poll = queue.poll();
                row.add(poll.val);
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
                size--;
            }
            if (!flag) {
                Collections.reverse(row);
            }
            ans.add(row);
            flag = !flag;
        }
        return ans;
    }
}
