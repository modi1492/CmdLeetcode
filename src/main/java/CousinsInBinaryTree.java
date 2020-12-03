import basic.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 993. 二叉树的堂兄弟节点
 */
public class CousinsInBinaryTree {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
        t2.right = t4;
        t3.right = t5;
        CousinsInBinaryTree c = new CousinsInBinaryTree();
        System.out.println(c.isCousins(t1,5,4));
    }

    /**
     * 层序遍历如果 xy是任意一个节点的左右孩子返回false 如果层序列表中有x 和y则是cousin
     *
     * @param root
     * @param x
     * @param y
     * @return
     */
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while (size > 0) {
                TreeNode poll = queue.poll();
                list.add(poll.val);
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
                if (poll.left != null && poll.right != null) {
                    if (poll.left.val == x && poll.right.val == y ||
                            poll.left.val == y && poll.right.val == x) {
                        return false;
                    }
                }
                size--;
            }
            if(list.contains(x) && list.contains(y)){
                return true;
            }
        }
        return false;
    }
}