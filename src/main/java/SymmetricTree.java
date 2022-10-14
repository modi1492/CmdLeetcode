import basic.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SymmetricTree {
    public static void main(String[] args) {}

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    public boolean isSymmetricQueue(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while (!queue.isEmpty()) {
            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();
            // 左节点为空并且右节点为空 继续
            if (node1 == null && node2 == null) {
                continue;
            }
            // 左节点为空并且右节点不为空; 左节点不为空 右节点不为空; 左右节点不为空，但是值不同
            if (node1 == null || node2 == null || (node1.val != node2.val)) {
                return false;
            }
            queue.offer(node1.left);
            queue.offer(node2.right);
            queue.offer(node1.right);
            queue.offer(node2.left);
        }
        return true;
    }

    public boolean isSymmetricStack(TreeNode root) {
        if (root == null) {
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while (!stack.isEmpty()) {
            TreeNode node1 = stack.pop();
            TreeNode node2 = stack.pop();
            // 左节点为空并且右节点为空 继续
            if (node1 == null && node2 == null) {
                continue;
            }
            // 左节点为空并且右节点不为空; 左节点不为空 右节点不为空; 左右节点不为空，但是值不同
            if (node1 == null || node2 == null || (node1.val != node2.val)) {
                return false;
            }
            stack.push(node1.left);
            stack.push(node2.right);
            stack.push(node1.right);
            stack.push(node2.left);
        }
        return true;
    }

    /**
     * 判断两棵树是不是对称的
     *
     * @param node1
     * @param node2
     * @return
     */
    private boolean isSymmetric(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null) {
            return false;
        }
        if (node2 == null) {
            return false;
        }
        return node1.val == node2.val
                && isSymmetric(node1.left, node2.right)
                && isSymmetric(node1.right, node2.left);
    }
}

// https://leetcode.cn/problems/Symmetric-Tree